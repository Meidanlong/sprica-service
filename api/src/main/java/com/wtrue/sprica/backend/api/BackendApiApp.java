package com.wtrue.sprica.backend.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/5 5:40 PM
 */
@EnableFeignClients
@SpringBootApplication
@ComponentScan(value = "com.wtrue.sprica.backend")
public class BackendApiApp {

    public static void main(String[] args) {
        SpringApplication.run(BackendApiApp.class);
    }
}
