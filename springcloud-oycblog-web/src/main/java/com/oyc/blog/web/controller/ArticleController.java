package com.oyc.blog.web.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.oyc.blog.api.feign.ArticleClient;
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
    private ArticleClient articleClient;

    @GetMapping
    public R list(){
        try {
            R hello = articleClient.hello();
            System.out.println(hello);
        } catch (Exception e) {
            e.printStackTrace();
        }
        R jsonResult = articleClient.selectAll();
        return jsonResult;
    }
}
