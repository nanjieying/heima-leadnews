package com.heima.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfiguration
 *
 * @author njy
 * @version 1.0
 * @description swagger
 * @date 2023/8/16 17:33
 * @say 山河总静好，人事也从容
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                // 要扫描的API(Controller)基础包
                .apis(RequestHandlerSelectors.basePackage("com.heima"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo buildApiInfo() {
        Contact contact = new Contact("医力捷","","");
        return new ApiInfoBuilder()
                .title("医力捷-平台管理API文档")
                .description("平台管理服务api")
                .contact(contact)
                .version("1.0.0").build();
    }
}