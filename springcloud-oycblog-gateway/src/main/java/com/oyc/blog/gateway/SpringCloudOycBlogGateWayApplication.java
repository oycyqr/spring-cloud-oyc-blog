package com.oyc.blog.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ouyangcheng
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudOycBlogGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOycBlogGateWayApplication.class, args);
    }

}
