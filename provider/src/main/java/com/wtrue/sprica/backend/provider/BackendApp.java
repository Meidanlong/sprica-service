package com.wtrue.sprica.backend.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/5 5:40 PM
 */
@SpringBootApplication
@ComponentScan(value = "com.wtrue.sprica.backend")
@MapperScan("com.wtrue.sprica.backend.service")
public class BackendApp {

    public static void main(String[] args) {
        SpringApplication.run(BackendApp.class);
    }
}
