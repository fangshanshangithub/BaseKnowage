package com.httpbase.httpbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //如果mybatis中service实现类中加入事务注解，需要此处添加该注解
@MapperScan("com.httpbase.httpbase.mapper") //mybatis配置 扫描的mapper -- 扫描的是mapper.xml中namespace指向值的包位置
@ServletComponentScan //有此注解后，项目中如果需要使用java原生的servlet和filter，可以在类中使用注解实现，主要是配置Druid监控时需要用到
public class HttpBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpBaseApplication.class, args);
    }

}
