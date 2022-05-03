package com.hzy.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 导入依赖
 * 2. 导入数据库驱动
 * 3. 配置yml文件
 * 4. @MapperScan
 * 5. 告诉MP sql映射文件的位置
 */
@MapperScan("com.hzy.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
