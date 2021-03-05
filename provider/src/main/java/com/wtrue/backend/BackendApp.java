package com.wtrue.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @author: meidanlong
 * @date: 2021/3/5 5:40 PM
 */
@MapperScan("com.wtrue.backend")
@SpringBootApplication
public class BackendApp {

    public static void main(String[] args) {
        SpringApplication.run(BackendApp.class);
    }
}
