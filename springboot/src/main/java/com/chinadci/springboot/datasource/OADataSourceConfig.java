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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.chinadci.springboot.mapper"}, sqlSessionFactoryRef = "oaSqlSessionFactory")
public class OADataSourceConfig {
    private DataSource dataSource;

    @Bean(name = "oaDataSource")//注入到这个容器
    @ConfigurationProperties(prefix = "spring.datasource.oa")
    @Primary
    public DataSource oaDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "oaSqlSessionFactory")
    @Primary
    public SqlSessionFactory oaSqlSessionFactory(@Qualifier("oaDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));

        return bean.getObject();
    }

    @Bean(name = "oaTransactionManager")//配置事务
    @Primary
    public DataSourceTransactionManager oaTransactionManager(@Qualifier("oaDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "oaSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate oaSqlSessionTemplate(@Qualifier("oaSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
