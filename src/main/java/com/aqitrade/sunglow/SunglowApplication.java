package com.aqitrade.sunglow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.aqitrade.sunglow.mapper"})
public class SunglowApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunglowApplication.class, args);

        System.out.println(" ============>  Sunglow Application started");
    }
}
