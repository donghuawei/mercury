package com.aqitrade.sunglow.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"com.aqitrade.sunglow.*.mapper"})
@ComponentScan(basePackages = {"com.aqitrade.sunglow"})
public class SunglowWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunglowWebApplication.class, args);

        System.out.println(" ============>  Sunglow Application started");
    }
}
