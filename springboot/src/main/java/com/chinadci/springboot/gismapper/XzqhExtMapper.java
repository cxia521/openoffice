package com.chinadci.springboot.gismapper;

import com.chinadci.springboot.gisentity.Xzqh;
import com.chinadci.springboot.gisentity.XzqhView;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: XzqhExtMapper
 * @Auther: xujk
 * @Date: 2020-8-5 13:38
 * @Description:
 */
public interface XzqhExtMapper extends XzqhMapper {

    @Select("SELECT xiang_name xiangname,rank FROM xzqh ORDER BY rank")
    List<XzqhView> getXZQH();

    List<Xzqh> getAllArea(@Param("parentCode") String parentCode);

    //生态保护红线分析	STHX_GJ	HXMC、HXLX
    @Select("SELECT A.*,CAST((select st_area(st_transform( ST_SetSRID(ST_GeomFromText( A.Intersection),4527),4527)) ) as DECIMAL(18,2))  AS area  FROM ( SELECT sa.objectid,  st_astext ( st_intersection ( ${shape}, sa.shape)) AS Intersection,sa.hxmc, sa.hxlx FROM sthx_gj sa )A where Intersection !='GEOMETRYCOLLECTION EMPTY'")
    List<HashMap> queryEcologyRedLline(@Param("shape") String shape);

    //生态管控区分析	STKZQ_SJ	MC、XZQ、area、BHQ
        @Select("SELECT A.*,  CAST((select st_area(st_transform( ST_SetSRID(ST_GeomFromText( A.Intersection),4527),4527)) ) as DECIMAL(18,2))  AS area  FROM ( SELECT sa.objectid,  st_astext ( st_intersection ( ${shape}, sa.shape)) AS Intersection,sa.mc, sa.xzq, CAST(sa.area as DECIMAL(18,2))  as marea, sa.bhq,sa.stgnq,sa.dq FROM STKZQ_SJ sa  )A where Intersection !='GEOMETRYCOLLECTION EMPTY'")
    List<HashMap> queryEcologyControl(@Param("shape") String shape);

    //永久基本农田占用分析	JBNTBHTB	XZMC、DLMC
    @Select("SELECT A.qsdwmc,A.xzmc, A.dlmc , CAST( \"sum\"( (select st_area(st_transform(\n" +
            "ST_SetSRID(ST_GeomFromText(\n" +
            "A.Intersection),4527),4527))\n" +
            " )) as DECIMAL(18,2)) AS area  FROM ( SELECT qsdwmc,sa.objectid,  st_astext ( st_intersection ( ${shape}, sa.shape)) AS Intersection,sa.xzmc, sa.dlmc  FROM JBNTBHTB sa  )A where Intersection !='GEOMETRYCOLLECTION EMPTY'\n" +
            " GROUP BY qsdwmc,xzmc,dlmc")
    List<HashMap> queryBasicFarmland(@Param("shape") String shape);

    //报批重叠检查分析	XZJS_ZS；XZJS_ZY	XMMC、YDPC、DKBH
    @Select("SELECT A.*,CAST((select st_area(st_transform( ST_SetSRID(ST_GeomFromText( A.Intersection),4527),4527)) ) as DECIMAL(18,2))   AS area  FROM ( SELECT 'ZS_' || sa.objectid as objectid,  st_astext ( st_intersection ( ${shape}, sa.shape)) AS Intersection,sa.xmmc, sa.ydpc ,sa.dkbh\n" +
            "            FROM XZJS_ZS sa\n" +
            "            UNION ALL\n" +
            "            SELECT 'ZY_' || sa.objectid as objectid,  st_astext ( st_intersection ( ${shape}, sa.shape)) AS Intersection,sa.xmmc, sa.ydpc ,sa.dkbh\n" +
            "            FROM XZJS_ZY sa  )A where Intersection !='GEOMETRYCOLLECTION EMPTY'")
    List<HashMap> queryApprovalOverlap(@Param("shape") String shape);

}
