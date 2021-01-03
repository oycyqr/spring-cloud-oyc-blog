package com.oyc.blog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author ouyangcheng
 */
@SpringBootApplication
@EnableFeignClients("com.oyc.blog.api.feign")
@ComponentScan(basePackages = {"com.oyc.blog.common","com.oyc.blog.web","com.oyc.blog.api"})
public class SpringCloudOycBlogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOycBlogWebApplication.class, args);
    }

}
