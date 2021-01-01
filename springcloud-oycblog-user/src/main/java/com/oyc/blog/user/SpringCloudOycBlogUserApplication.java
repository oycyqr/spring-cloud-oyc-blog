package com.oyc.blog.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


/**
 * @author ouyangcheng
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.oyc.blog.user","com.oyc.blog.common"})
public class SpringCloudOycBlogUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOycBlogUserApplication.class, args);
    }

}
