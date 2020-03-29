package com.soft1851.spring.webAnnotation.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author su
 * @className JDBCConfig
 * @Description TODO
 * @Date 2020/3/19 8:16
 * @Version 1.0
 **/

@Configuration
@ComponentScan("com.soft1851.spring.webAnnotation")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
public class JDBCConfig {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(jdbcUrl);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        //配置初始化大小、最小、最大连接数
        druidDataSource.setInitialSize(1);
        druidDataSource.setMinIdle(1);
        druidDataSource.setMaxActive(20);
        //配置获取连接等待超时的时间
        druidDataSource.setMaxWait(60000);
        //配置间隔多久才进行一次检验，检测需要关闭的空闲连接，单位是毫秒
        druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
        //配置一个连接在池中最小生存时间，单位是毫秒
        druidDataSource.setMinEvictableIdleTimeMillis(300000);
        //禁止自动提交，实现事务管理
        druidDataSource.setDefaultAutoCommit(false);
        //设定连接池启用预处理事务集
        druidDataSource.setPoolPreparedStatements(true);
        return druidDataSource;
    }

    /**
     * jdbcTemplate模版配置
     *
     * @param druidDataSource
     * @return JdbcTemplate
     */
    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
        return new JdbcTemplate(druidDataSource);
    }

    /**
     * 装配事务管理
     *
     * @param druidDataSource
     * @return
     */
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DruidDataSource druidDataSource){
        return new DataSourceTransactionManager(druidDataSource);
    }





//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(JDBCConfig.class);
//        DruidDataSource druidDataSource = (DruidDataSource) aca.getBean("dataSource");
//        System.out.println(druidDataSource);
//        JdbcTemplate jdbcTemplate = (JdbcTemplate) aca.getBean("jdbcTemplate");
//        System.out.println(jdbcTemplate);
//    }
}
