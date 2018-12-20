package com.aqitrade.mercury.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"com.aqitrade.mercury.*.mapper"})
@ComponentScan(basePackages = {"com.aqitrade.mercury"})
public class MercuryWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercuryWebApplication.class, args);

        System.out.println(" ============>  Mercury Application started");
    }
}
