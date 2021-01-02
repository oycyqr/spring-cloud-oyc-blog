package com.oyc.blog.api.feign;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/1 11:28 下午
 */
@FeignClient("springcloud-oycblog-article")
public interface ArticleClient {

    @GetMapping("/article")
    R selectAll();

    @GetMapping("/hello")
    R hello();
}
