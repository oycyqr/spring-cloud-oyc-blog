package com.oyc.blog.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.oyc.blog")
@ComponentScan(basePackages = {"com.oyc.blog"})
public class SpringCloudOycBlogAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOycBlogAdminApplication.class, args);
    }

}
