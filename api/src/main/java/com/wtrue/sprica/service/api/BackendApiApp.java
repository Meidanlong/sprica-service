package com.wtrue.sprica.service.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/5 5:40 PM
 */
@EnableFeignClients
@SpringBootApplication
public class BackendApiApp {

    public static void main(String[] args) {
        SpringApplication.run(BackendApiApp.class);
    }
}
