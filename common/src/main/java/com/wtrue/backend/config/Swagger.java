package com.wtrue.backend.config;


import com.wtrue.sprica.common.config.SwaggerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/25 7:43 PM
 */
@Configuration
@EnableSwagger2
public class Swagger {

    @Bean
    public Docket swagger(){
        Contact contact = new Contact("sprica", "http://www.sprica.cn", "meidanlong@qq.com");
        SwaggerConfig swagger = SwaggerConfig.builder().title("model").contact(contact).description("model api文档").version("1.0.0-SNAPSHOT").url("http://www.sprica.cn").build();
        Docket docket = swagger.createRestApiOfAnyPackage();
        System.out.println(docket.toString());
        return swagger.createRestApiOfAnyPackage();
    }

}
