package com.hzy.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MallCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCommonApplication.class, args);
    }

}
