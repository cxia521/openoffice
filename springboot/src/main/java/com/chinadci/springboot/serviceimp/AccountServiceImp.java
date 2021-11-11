package com.chinadci.springboot.serviceimp;


import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
import com.artofsolving.jodconverter.openoffice.converter.StreamOpenOfficeDocumentConverter;
import com.chinadci.springboot.entity.*;
import com.chinadci.springboot.gismapper.XzqhExtMapper;
import com.chinadci.springboot.mapper.AffixinfoMapper;

import com.chinadci.springboot.model.sysmodel.ServiceListResult;
import com.chinadci.springboot.model.sysmodel.ServiceObjectResult;
import com.chinadci.springboot.model.sysmodel.ServiceResult;
import com.chinadci.springboot.model.sysmodel.ServiceResultCode;
import com.chinadci.springboot.service.IAccountService;
import com.mongodb.client.gridfs.model.GridFSFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;

import javax.servlet.ServletOutputStream;
import java.io.*;
import java.math.BigDecimal;
import java.net.ConnectException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @description:
 * @author: keke wei
 * @create: 2020-06-02 11:55
 **/
@RefreshScope //动态刷新配置
@Service
public class AccountServiceImp implements IAccountService {


    private final static Logger logger = LoggerFactory.getLogger(AccountServiceImp.class);
    @Autowired
    AffixinfoMapper affixinfoMapper;
    @Value("${isol}")
    String isol;
    @Value("${ip}")
    String ip;
    @Value("${sourcefile}")
    String sourcefile;
    @Value("${pdffile}")
    String pdffile;

    @Autowired
    GridFsTemplate gridFsTemplate;

    @Override
    public ServiceObjectResult ConvertbyId(String id) {

        ServiceObjectResult serviceResult = new ServiceObjectResult<>();
        try {
            Affixinfo affixinfo = affixinfoMapper.selectByPrimaryKey(id);
            GridFSFile file = null;
            if (!StringUtils.isEmpty(affixinfo.getAffixid())) {
                file = gridFsTemplate.findOne(Query.query(Criteria.where("_id").is(affixinfo.getFilemgid())));
            }
            if (null == file) {
                throw new RuntimeException("ID对应文件不存在");
            }
            byte bs[] = new byte[1024];
            GridFsResource resource = gridFsTemplate.getResource(file);
            InputStream inputStream = resource.getInputStream();
            String previewurl = office2PDF(inputStream, affixinfo);//
            affixinfo.setPreviewurl(previewurl);
            affixinfoMapper.updateByPrimaryKeySelective(affixinfo);

            serviceResult.ReturnCode = ServiceResultCode.Success.getindex();
        } catch (Exception ex) {
            Affixinfo affixinfo = affixinfoMapper.selectByPrimaryKey(id);
            affixinfo.setOpcount(affixinfo.getOpcount() + 1);
            affixinfoMapper.updateByPrimaryKey(affixinfo);

            serviceResult.Message = ex.toString();
            serviceResult.ReturnCode = ServiceResultCode.Error.getindex();
        }
        return serviceResult;
    }

    @Override
    public void Convert(String yuan, String mu, String ip) {
        office2PDFss(yuan, mu, ip);

    }

    public String office2PDF(InputStream inputStream, Affixinfo affixinfo) {
        try {

            String docFileName = null;
            String htmFileName = null;
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyMMddHH");
            SimpleDateFormat hhmmss = new SimpleDateFormat("mmss");

            if ("doc".equals(affixinfo.getExtname())) {
                docFileName = hhmmss.format(date) +"_" + affixinfo.getAffixename() + ".doc";
                htmFileName = hhmmss.format(date) +"_" + affixinfo.getAffixename() + ".pdf";
            } else if ("docx".equals(affixinfo.getExtname())) {
                docFileName = hhmmss.format(date) +"_" +  affixinfo.getAffixename() + ".docx";
                htmFileName = hhmmss.format(date) +"_" + affixinfo.getAffixename() + ".pdf";
            } else if ("xls".equals(affixinfo.getExtname())) {
                docFileName = hhmmss.format(date) +"_" +  affixinfo.getAffixename() + ".xls";
                htmFileName = hhmmss.format(date) +"_" + affixinfo.getAffixename() + ".pdf";
            } else if ("ppt".equals(affixinfo.getExtname())) {
                docFileName = hhmmss.format(date) +"_" +  affixinfo.getAffixename() + ".ppt";
                htmFileName = hhmmss.format(date) +"_" + affixinfo.getAffixename() + ".pdf";
            } else if ("txt".equals(affixinfo.getExtname())) {
                docFileName = hhmmss.format(date) +"_" +  affixinfo.getAffixename() + ".ppt";
                htmFileName = hhmmss.format(date) +"_" + affixinfo.getAffixename() + ".pdf";
            }



            System.out.println(sourcefile + formatter.format(date) + "/" +hhmmss.format(date)+"_" + docFileName);
            //读取文件夹路径
            File file = new File(sourcefile + formatter.format(date));
           //判断是否存在
            if (!file.exists() && !file.isDirectory()) {
                System.out.println("文件夹不存在！");
                  //生成文件夹
                file.mkdir();
            }
            File inputFile = inputStream2File(inputStream, new File(sourcefile + formatter.format(date) + "/" + docFileName));
            if (!inputFile.exists()) {
                return "找不到源文件";// 找不到源文件, 则返回-1
            }
            // 如果目标路径不存在, 则新建该路径
             File outputFile = new File(pdffile + formatter.format(date) + "/" + htmFileName);
            if (!outputFile.getParentFile().exists()) {
                outputFile.getParentFile().mkdirs();
            }
            System.out.println(pdffile + htmFileName);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            logger.info("开始时间：" + sdf.format(new Date()));
            OpenOfficeConnection connection = new SocketOpenOfficeConnection(
                    ip, 8100);
            connection.connect();
//            DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
            DocumentConverter converter = new StreamOpenOfficeDocumentConverter(connection);//linux

            converter.convert(inputFile, outputFile);
            logger.info("结束当前时间：" + sdf.format(new Date()));
            connection.disconnect();
            return pdffile + formatter.format(date) + "/" + htmFileName;
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    /**
     * 将inputStream转化为file
     *
     * @param is
     * @param file 要输出的文件目录
     */
    public static File inputStream2File(InputStream is, File file) throws IOException {
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            int len = 0;
            byte[] buffer = new byte[8192];

            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
        } finally {
            os.close();
            is.close();
        }
        return file;
    }

    public static int office2PDFss(String sourceFile, String destFile, String ip) {
        try {
            File inputFile = new File(sourceFile);
            if (!inputFile.exists()) {
                return -1;// 找不到源文件, 则返回-1
            }
            // 如果目标路径不存在, 则新建该路径
            File outputFile = new File(destFile);
            if (!outputFile.getParentFile().exists()) {
                outputFile.getParentFile().mkdirs();
            }
            // connect to an OpenOffice.org instance running on port 8100
            OpenOfficeConnection connection = new SocketOpenOfficeConnection(
                    ip, 8100);
            connection.connect();
            // convert
//          DocumentConverter converter=new OpenOfficeDocumentConverter( connection);//windwo
            DocumentConverter converter = new StreamOpenOfficeDocumentConverter(connection);//linux
            converter.convert(inputFile, outputFile);
            connection.disconnect();

            return 0;
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 1;
    }

};


