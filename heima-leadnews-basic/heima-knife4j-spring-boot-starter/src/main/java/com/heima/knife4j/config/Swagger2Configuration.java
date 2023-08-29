//package com.heima.knife4j.config;
//
//import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * Swagger2Configuration
// *
// * @author njy
// * @version 1.0
// * @description 引入小刀
// * @date 2023/8/16 18:20
// * @say 山河总静好，人事也从容
// */
//@Configuration
//@EnableSwagger2
//@EnableKnife4j
//@Import(BeanValidatorPluginsConfiguration.class)
//public class Swagger2Configuration {
//
//    @Bean(value = "defaultApi2")
//    public Docket defaultApi2() {
//        Docket docket=new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                //分组名称
//                .groupName("1.0")
//                .select()
//                //这里指定Controller扫描包路径
//                .apis(RequestHandlerSelectors.basePackage("com.heima"))
//                .paths(PathSelectors.any())
//                .build();
//        return docket;
//    }
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("黑马头条API文档")
//                .description("黑马头条API文档")
//                .version("1.0")
//                .build();
//    }
//}