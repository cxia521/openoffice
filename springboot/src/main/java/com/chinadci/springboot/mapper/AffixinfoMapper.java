package com.chinadci.springboot.mapper;

import com.chinadci.springboot.entity.Affixinfo;
import com.chinadci.springboot.entity.AffixinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AffixinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    long countByExample(AffixinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    int deleteByExample(AffixinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    int deleteByPrimaryKey(String affixid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    int insert(Affixinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    int insertSelective(Affixinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    List<Affixinfo> selectByExampleWithRowbounds(AffixinfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    List<Affixinfo> selectByExample(AffixinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    Affixinfo selectByPrimaryKey(String affixid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    int updateByExampleSelective(@Param("record") Affixinfo record, @Param("example") AffixinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    int updateByExample(@Param("record") Affixinfo record, @Param("example") AffixinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    int updateByPrimaryKeySelective(Affixinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affixinfo
     *
     * @mbg.generated Tue Nov 09 15:25:12 CST 2021
     */
    int updateByPrimaryKey(Affixinfo record);
}