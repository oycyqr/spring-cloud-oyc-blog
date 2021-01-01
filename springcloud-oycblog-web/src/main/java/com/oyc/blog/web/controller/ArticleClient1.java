package com.oyc.blog.web.controller;

import com.oyc.blog.core.domain.JsonResult;
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
public interface ArticleClient1 {

    @GetMapping("/article")
    JsonResult selectAll();

    @GetMapping("/hello")
    JsonResult hello();
}
