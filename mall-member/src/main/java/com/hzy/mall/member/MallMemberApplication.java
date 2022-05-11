package com.hzy.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用其他服务
 * 1. 引入open-feign
 * 2. 编写一个接口，告诉SpringCloud要远程调用
 * 3. 声明接口的每一个接口调用的是哪个服务
 * 4.开启
 */

// 自动扫描接口
@EnableFeignClients(basePackages = "com.hzy.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
