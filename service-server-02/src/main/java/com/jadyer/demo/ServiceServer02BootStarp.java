package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceServer02BootStarp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceServer02BootStarp.class, args);
    }
}