package com.chinadci.mapservice.comm;

import com.alibaba.cloud.nacos.registry.NacosAutoServiceRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.Query;
import java.lang.management.ManagementFactory;
import java.util.Set;

/**
 * @program: 后台
 * @description:
 * @author: keke
 * @create: 2021-06-08 11:09
 **/
@Configuration
public class NacosConfig implements ApplicationRunner {
    @Autowired(required = false)
    private NacosAutoServiceRegistration registration;
    @Value("${server.port}")
    Integer port;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(port);
        if (registration != null && port != null) {
            Integer tomcatPort = port;
            try {
                tomcatPort = new Integer(getTomcatPort());
            } catch (Exception e) {
                System.out.println(1111);
                System.out.println(e);
                e.printStackTrace();
            }
            System.out.println(tomcatPort);
            registration.setPort(tomcatPort);
            registration.start();
        }
    }

    /**
     * 获取外部tomcat端口
     */
    public String getTomcatPort() throws Exception {
        MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
        Set<ObjectName> objectNames = beanServer.queryNames(new ObjectName("*:type=Connector,*"), Query.match(Query.attr("protocol"), Query.value("HTTP/1.1")));
        String port = objectNames.iterator().next().getKeyProperty("port");
        return port;
    }
}

