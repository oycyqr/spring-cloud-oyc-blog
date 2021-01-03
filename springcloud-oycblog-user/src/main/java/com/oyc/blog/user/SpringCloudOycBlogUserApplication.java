package com.oyc.blog.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author ouyangcheng
 */
@SpringBootApplication
@ComponentScan({"com.oyc.blog.user","com.oyc.blog.common"})
public class SpringCloudOycBlogUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOycBlogUserApplication.class, args);
    }

}
