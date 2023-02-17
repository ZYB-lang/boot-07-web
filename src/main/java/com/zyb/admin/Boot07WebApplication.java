package com.zyb.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.zyb.admin")
@SpringBootApplication
@MapperScan(basePackages = {"com.zyb.admin.mapper"})
public class Boot07WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot07WebApplication.class, args);
        System.out.println("1");
        System.out.println("2");
        System.out.println("4");
    }

}
