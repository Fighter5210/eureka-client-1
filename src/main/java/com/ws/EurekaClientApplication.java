package com.ws;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:启动类
 *
 * @author: wangdy
 *
 * @create: 2019/5/16 下午8:24
 **/
@EnableEurekaClient
@SpringBootApplication(scanBasePackages={
        "com.ws"})
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}

