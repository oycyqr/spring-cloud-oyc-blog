package com.oyc.blog.article.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
