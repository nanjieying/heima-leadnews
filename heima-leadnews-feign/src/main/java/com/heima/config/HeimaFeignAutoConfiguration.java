package com.heima.config;

import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * HeimaFeignAutoConfiguration
 *
 * @author njy
 * @version 1.0
 * @description
 * @date 2023/8/18 14:32
 * @say 山河总静好，人事也从容
 */
@Configuration
@EnableFeignClients(basePackages = "com.heima.feigns")
@ComponentScan("com.heima.feigns.fallback")
public class HeimaFeignAutoConfiguration {
    @Bean
    Logger.Level level(){
        return Logger.Level.FULL;
    }
}