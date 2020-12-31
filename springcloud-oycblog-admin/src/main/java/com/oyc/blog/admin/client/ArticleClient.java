package com.oyc.blog.admin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: ArticleClient
 * @Description: ArticleClient
 * @Author oyc
 * @Date 2020/12/31 17:01
 * @Version 1.0
 */
@FeignClient("springcloud-oycblog-article")
public interface ArticleClient {

    @GetMapping("/article")
    Object selectAll();

    @GetMapping("/hello")
    String hello();
}
