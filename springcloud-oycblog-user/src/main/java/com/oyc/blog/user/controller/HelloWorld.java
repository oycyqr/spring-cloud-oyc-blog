package com.oyc.blog.user.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.baomidou.mybatisplus.extension.api.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author oyc
 * @Date 2020/12/30 11:48 下午
 */
@RestController
@RequestMapping("hello")
@Slf4j
public class HelloWorld {

    @GetMapping
    @SentinelResource("hello")
    public R hello() {
        log.info("invoked Hello World");
        return R.ok("oyc blog user HelloWorld");
    }
}
