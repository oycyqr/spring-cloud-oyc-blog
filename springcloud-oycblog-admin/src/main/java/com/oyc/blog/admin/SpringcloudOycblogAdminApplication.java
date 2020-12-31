package com.oyc.blog.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringcloudOycblogAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOycblogAdminApplication.class, args);
    }

}
