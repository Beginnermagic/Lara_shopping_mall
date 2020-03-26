package com.laola.gamll.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.laola.gamll.user.mapper")
public class GamllUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamllUserApplication.class, args);
    }

}
