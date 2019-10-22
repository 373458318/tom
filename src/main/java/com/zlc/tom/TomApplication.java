package com.zlc.tom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@MapperScan("com.zlc.tom.xiaochengxu.mapper") //扫描的mapper
@SpringBootApplication
public class TomApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TomApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TomApplication.class);
    }

}
