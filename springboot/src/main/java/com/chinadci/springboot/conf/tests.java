//package com.chinadci.springboot.conf;
//
//
//import com.artofsolving.jodconverter.DocumentConverter;
//import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
//import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
//import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
//import com.artofsolving.jodconverter.openoffice.converter.StreamOpenOfficeDocumentConverter;
////import com.chinadci.springboot.controller.Doc2HtmlUtil;
//import com.mongodb.client.gridfs.model.GridFSFile;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.mongodb.gridfs.GridFsResource;
//import org.springframework.data.mongodb.gridfs.GridFsTemplate;
//import org.springframework.util.StringUtils;
//
//import javax.servlet.ServletOutputStream;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.ConnectException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class tests {
//
//    private final static Logger logger = LoggerFactory.getLogger(tests.class);
//
//    @Test
//    public void getByIdAndNameTest() {
////        Vonverttopdf("D:/poi-test/test.doc","D:/poi-test/openOffice/docsss.pdf","");
////        office2PDF("D:/poi-test/test.doc","D:/poi-test/openOffice/dest.pdf");
////        office2PDF("D:/poi-test/tests.txt","D:/poi-test/openOffice/txtssss.pdf");
////        office2PDF("D:/poi-test/test.doc","D:/poi-test/openOffice/dest.pdf");
////        office2PDF("D:/poi-test/test.doc","D:/poi-test/openOffice/dest.pdf");
//
//        String sss = "http://111.198.5.20:8081/cgi-bin/mapserv.exe?map=C:/ms4w/maps/weifang/windows/weifang_yun_weifang.map&mode=map&layers=wwbh_wwbhyz_layer";
//
//        String url =  sss.substring(0, sss.lastIndexOf("&mode"));
//        String layers =sss.substring(sss.lastIndexOf("&layers=")+8);
//        String legendUrl = url + "&service=wms&REQUEST=GetLegendGraphic&VERSION=1.3.0&sld_version=1.1.0&layer="+layers+"&format=image/png";
//
////
////        String aad = sss.substring(sss.lastIndexOf("&layers=")+8  ,sss.length());
////        String ssa = sss.substring(0, sss.lastIndexOf("&layers"));
//
//
//        System.out.println(legendUrl);
////        System.out.println(ssa);
//    }
//c
////dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd
//    @Test
//    public void conn() {
//        OpenOfficeConnection connection = new SocketOpenOfficeConnection("192.168.0.197", 8100);
////      OpenOfficeDocumentConverter openOfficeDocumentConverter=  new StreamOpenOfficeDocumentConverter(connection);
//        try {
//            System.err.println("开启连接");
//            connection.connect();
//            System.err.println("连接成功");
//        } catch (Exception e) {
//            String string = e.getMessage();
//            System.out.println("连接失败");
//            System.err.println(string);
//            // TODO: handle exception
//        }
//    }
//
//    ;
//
//
//    public boolean Vonverttopdf(String srcPath, String desPath, String ID) {
//        boolean reurlt = false;
//
//        try {
//            // 源文件目录
//            File inputFile = new File(srcPath);
//            if (!inputFile.exists()) {
//                logger.info("源文件不存在==》" + ID);
//            } else {
//                // 输出文件目录
//                File outputFile = new File(desPath);
//                if (!outputFile.getParentFile().exists()) {
//                    outputFile.getParentFile().exists();
//                }
//                // 调用openoffice服务线程
//                String command = "C:\\Program Files (x86)\\OpenOffice 4\\program\\soffice.exe -headless -accept=\"socket,host=127.0.0.1,port=8100;urp;\"";
//                Process p = Runtime.getRuntime().exec(command);
//                // 连接openoffice服务
//                OpenOfficeConnection connection = new SocketOpenOfficeConnection(
//                        "127.0.0.1", 8100);
//                connection.connect();
//                // 转换word到pdf
//                DocumentConverter converter = new OpenOfficeDocumentConverter(
//                        connection);
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                logger.info("开始时间：" + sdf.format(new Date()));
//                converter.convert(inputFile, outputFile);
//                logger.info("结束当前时间：" + sdf.format(new Date()));
//                // 关闭连接
//                connection.disconnect();
//                // 关闭进程
//                p.destroy();
//                System.out.println("转换完成！");
//                reurlt = true;
//            }
//        } catch (Exception ex) {
////            logger.info("转化失败==》" + ID + ex.getMessage());
//        }
//        return reurlt;
//    }
//
//    public static int office2PDF(String sourceFile, String destFile) {
//        try {
//
//            File inputFile = new File(sourceFile);
//            if (!inputFile.exists()) {
//                return -1;// 找不到源文件, 则返回-1
//            }
//
//            // 如果目标路径不存在, 则新建该路径
//            File outputFile = new File(destFile);
//            if (!outputFile.getParentFile().exists()) {
//                outputFile.getParentFile().mkdirs();
//            }
//
//            // connect to an OpenOffice.org instance running on port 8100
//            OpenOfficeConnection connection = new SocketOpenOfficeConnection(
//                    "192.168.0.197", 8100);
//            connection.connect();
//
//            // convert
//            DocumentConverter converter = new OpenOfficeDocumentConverter(
//                    connection);
//            converter.convert(inputFile, outputFile);
//
//            // close the connection
//            connection.disconnect();
//
//            return 0;
//        } catch (ConnectException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return 1;
//    }
//
//};
//
//
