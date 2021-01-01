package com.oyc.blog.article.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oyc.blog.article.entity.Article;
import com.oyc.blog.article.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 文章表(Article)表控制层
 *
 * @author oyc
 * @since 2020-12-31 16:47:33
 */
@RestController
@RequestMapping("hello")
public class HelloController extends ApiController {

    /**
     * @return test hello
     */
    @GetMapping
    public R hello() {
        return R.ok("hello from article");
    }

}
