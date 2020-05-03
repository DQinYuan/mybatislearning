package com.example.mapperxml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapperxml")
public class MapperxmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperxmlApplication.class, args);
    }

}
