package com.oyc.blog.web.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.oyc.blog.api.feign.UserClient;
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
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping
    public R list() {
        try {
            R hello = userClient.hello();
            System.out.println(hello);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            R jsonResult = userClient.list();
            System.out.println(jsonResult);
            return jsonResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
