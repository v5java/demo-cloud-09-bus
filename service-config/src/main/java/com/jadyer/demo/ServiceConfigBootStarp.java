package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//开启配置中心
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ServiceConfigBootStarp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigBootStarp.class, args);
    }
}