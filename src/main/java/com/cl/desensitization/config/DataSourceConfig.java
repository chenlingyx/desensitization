//package com.cl.desensitization.config;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.*;
//
///**
// * @author chenling
// * @date 2020/1/7 14:28
// * @since V1.0.0
// */
//@Configuration
//public class DataSourceConfig {
//
//    @Value("${spring.datasource.driverClassName}")
//    private String driverClassName;
//
//    @Value("${spring.datasource.url}")
//    private String jdbcUrl;
//
//    @Value("${spring.datasource.username}")
//    private String userName;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Autowired
//    private Environment environment;
//
//
//    @Bean(name = "dataSource")
//    public DataSource getDataSource() throws SQLException {
//        HikariDataSource hds = new HikariDataSource();
//        hds.setJdbcUrl(jdbcUrl);
//        hds.setDriverClassName(driverClassName);
//        hds.setUsername(userName);
//        hds.setPassword(password);
//         return hds;
//    }
//
//}
