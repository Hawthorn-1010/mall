package com.hzy.mall.product;

import com.aliyun.oss.*;
import com.hzy.mall.product.entity.BrandEntity;
import com.hzy.mall.product.service.BrandService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallProductApplicationTests  {

    @Autowired
    private BrandService brandService;

    @Autowired
    private OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {

        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-beijing.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tBYDeVHVu8sYA65GDDX";
//        String accessKeySecret = "CqrSLKsNggwrH2hdDPqlgQDLCrqEZx";
        // 填写Bucket名称，例如examplebucket。
        String bucketName = "hzy-mall";
        // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
        String objectName = "exampledir/exampleobject.txt";
        // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
        // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件。
        String filePath= "D:\\B公钥.txt";

        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ossClient.putObject(bucketName, "B公钥.txt", fileInputStream);

        ossClient.shutdown();
    }

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("acer");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
