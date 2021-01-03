package com.oyc.blog.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: SpringCloudOycBlogSearch
 * @Description: SpringCloudOycBlogSearch
 * @Author oyc
 * @Date 2020/12/31 16:34
 * @Version 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients("com.oyc.blog.api.feign")
public class SpringCloudOycBlogSearch {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOycBlogSearch.class,args);
    }
}
