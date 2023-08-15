package com.weiservers.sc2online.config;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;

public class MyBatisConfig {


    @Bean
    public SqlSessionFactoryBean sessionFactoryBean(DataSource ds) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(ds);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.weiservers.sconline.pojo");
        Interceptor[] interceptors = new Interceptor[]{pageInterceptor()};
        sqlSessionFactoryBean.setPlugins(interceptors);
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.weiservers.sconline.mapper");
        return msc;
    }

    public com.github.pagehelper.PageInterceptor pageInterceptor() {
        com.github.pagehelper.PageInterceptor interceptor = new com.github.pagehelper.PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        interceptor.setProperties(properties);
        return interceptor;
    }


}
