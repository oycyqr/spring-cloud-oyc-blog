package com.oyc.blog.web.controller;

import com.oyc.blog.api.client.ArticleClient;
import com.oyc.blog.core.domain.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/1 2:49 下午
 */
@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private ArticleClient1 articleClient1;

    @GetMapping
    public JsonResult list(){
        JsonResult hello = articleClient1.hello();
        System.out.println(hello);
        JsonResult jsonResult = articleClient1.selectAll();
        return jsonResult;
    }
}
