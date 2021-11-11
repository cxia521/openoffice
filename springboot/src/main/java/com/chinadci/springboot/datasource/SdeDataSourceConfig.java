package com.chinadci.springboot.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = {"com.chinadci.springboot.gismapper"}, sqlSessionFactoryRef = "sdeSqlSessionFactory")
public class SdeDataSourceConfig {
    private DataSource dataSource;

    @Bean(name = "sdeDataSource")//注入到这个容器
    @ConfigurationProperties(prefix = "spring.datasource.modelsde")
    public DataSource sdeDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sdeSqlSessionFactory")
    public SqlSessionFactory sdeSqlSessionFactory(@Qualifier("sdeDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:gismapper/*.xml"));

        return bean.getObject();
    }

    @Bean(name = "sdeTransactionManager")//配置事务
    public DataSourceTransactionManager sdeTransactionManager(@Qualifier("sdeDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sdeSqlSessionTemplate")
    public SqlSessionTemplate sdeSqlSessionTemplate(@Qualifier("sdeSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

