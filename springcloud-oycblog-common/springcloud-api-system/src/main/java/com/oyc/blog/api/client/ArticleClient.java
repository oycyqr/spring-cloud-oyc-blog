package com.oyc.blog.api.client;

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
public interface ArticleClient {

    @GetMapping("/article")
    JsonResult selectAll();

    @GetMapping("/hello")
    JsonResult hello();
}
