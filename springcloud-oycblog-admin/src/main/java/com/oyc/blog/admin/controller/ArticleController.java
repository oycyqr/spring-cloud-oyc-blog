package com.oyc.blog.admin.controller;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oyc.blog.api.feign.ArticleClient;

/**
 * @ClassName: ArticleController
 * @Description: ArticleController
 * @Author oyc
 * @Date 2020/12/31 17:03
 * @Version 1.0
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleClient articleClient;

    @GetMapping
    public Object list(){
        R hello = articleClient.hello();
        System.out.println(hello);
        return articleClient.selectAll();
    }
}
