package com.oyc.blog.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: com.oyc.blog.article.SpringCloudOycBlogArticle
 * @Description: com.oyc.blog.article.SpringCloudOycBlogArticle
 * @Author oyc
 * @Date 2020/12/31 16:02
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.oyc.blog.article","com.oyc.blog.common"})
public class SpringCloudOycBlogArticle {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOycBlogArticle.class,args);
    }
}
