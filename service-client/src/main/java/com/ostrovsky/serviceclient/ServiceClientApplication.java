package com.ostrovsky.serviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: eurekassm
 * @description: 客户端服务启动入口
 * @author: Ostrovsky
 * @create: 2018-09-12 17:41:11
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }
}
