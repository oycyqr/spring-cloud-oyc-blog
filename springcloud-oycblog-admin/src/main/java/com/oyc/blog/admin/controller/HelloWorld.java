package com.oyc.blog.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
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
@RequestMapping
@Slf4j
public class HelloWorld {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    /*@GetMapping("/test")
    public String test() {
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        ServiceInstance serviceInstance = loadBalancerClient.choose("spring-cloud-nacos-server");
        String url = serviceInstance.getUri() + "/server/hello";
        String result = restTemplate.getForObject(url, String.class);
        return "Invoke : " + url + ", return : " + result;
    }*/

    @GetMapping("hello")
    public String hello() {
        log.info("invoked Hello World");
        return "oyc blog admin Hello World";
    }

    @GetMapping("admin")
    public String admin() {
        log.info("invoked Hello admin");
        return "oyc blog admin Hello admin";
    }


    @GetMapping("user")
    public String user() {
        log.info("invoked Hello user");
        return "oyc blog admin Hello user";
    }
}
