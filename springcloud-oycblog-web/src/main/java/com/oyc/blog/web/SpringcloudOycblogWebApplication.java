package com.oyc.blog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudOycblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOycblogWebApplication.class, args);
    }

}
