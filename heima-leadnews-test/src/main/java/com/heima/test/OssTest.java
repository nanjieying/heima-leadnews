package com.heima.test;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectResult;

import java.io.FileInputStream;

/**
 * OssTest
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/24 14:39
 * @say 山河总静好，人事也从容
 */
public class OssTest {
    public static void main(String[] args) throws Exception{
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。
        String accessKeyId = "";
        String accessKeySecret = "";
//        String endpoint = "http://oss-cn-shanghai.aliyuncs.com";
//        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。
//        String accessKeyId = "LTAI4G8RTSUp2UuN1Ab7AhrZ";
//        String accessKeySecret = "d4idycRKzMjrQOib60ZMVTTkBWeAUO";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传Byte数组。
        FileInputStream inputStream = new FileInputStream("D://常用软件/录屏/录制的视频/2022-11-08_14-02-06.png");
        PutObjectResult result = ossClient.putObject("xiaonan-news", "2022-11-08_14-02-06", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}