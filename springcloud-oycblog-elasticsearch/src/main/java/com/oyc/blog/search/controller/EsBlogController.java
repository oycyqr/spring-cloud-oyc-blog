package com.oyc.blog.search.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.oyc.blog.api.feign.ArticleClient;
import com.oyc.blog.search.service.EsBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/3 9:52 上午
 */
@RestController
@RequestMapping("blog")
public class EsBlogController {

    @Autowired
    private EsBlogService esBlogService;

    @Autowired
    private ArticleClient articleClient;

    @GetMapping
    public Object list() {
        try {
            R r = articleClient.selectAll();
            if(r!=null){
                return r;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return esBlogService.findAll();
    }
}
