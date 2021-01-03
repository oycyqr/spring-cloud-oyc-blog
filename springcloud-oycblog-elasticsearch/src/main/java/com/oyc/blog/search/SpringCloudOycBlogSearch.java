package com.oyc.blog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: SpringCloudOycBlogSearch
 * @Description: SpringCloudOycBlogSearch
 * @Author oyc
 * @Date 2020/12/31 16:34
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.oyc.blog.api.feign")
@ComponentScan(basePackages = {"com.oyc.blog.common", "com.oyc.blog.search", "com.oyc.blog.api"})
public class SpringCloudOycBlogSearch {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOycBlogSearch.class, args);
    }
}
