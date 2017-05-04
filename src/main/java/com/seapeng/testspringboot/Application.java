package com.seapeng.testspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zseapeng on 13/4/17.
 */
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
    /*
    @SpringBootApplication 等价于以下三个注解
        @Configuration
        @EnableAutoConfiguration
        @ComponentScan
     */
@SpringBootApplication
@MapperScan(value = "com.seapeng.testspringboot.dao")

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
