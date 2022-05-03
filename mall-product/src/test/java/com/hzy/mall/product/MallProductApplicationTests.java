package com.hzy.mall.product;

import com.hzy.mall.product.entity.BrandEntity;
import com.hzy.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("acer");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
