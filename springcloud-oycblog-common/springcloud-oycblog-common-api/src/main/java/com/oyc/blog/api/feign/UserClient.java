package com.oyc.blog.api.feign;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oyc.blog.api.fallback.UserClientFallback;
import com.oyc.blog.common.domain.BlogUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/1 11:28 下午
 */
@FeignClient(value = "springcloud-oycblog-user",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/hello")
    R hello();

    @GetMapping("user/list")
    R list();

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param blogUser 查询实体
     * @return 所有数据
     */
//    @GetMapping("user")
//    R selectAllUser(Page<BlogUser> page, BlogUser blogUser);

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("user/{id}")
    R selectOneUser(@PathVariable Serializable id);

    /**
     * 新增数据
     *
     * @param blogUser 实体对象
     * @return 新增结果
     */
    @PostMapping("user")
    R insertUser(@RequestBody BlogUser blogUser);

    /**
     * 修改数据
     *
     * @param blogUser 实体对象
     * @return 修改结果
     */
    @PutMapping("user")
    R updateUser(@RequestBody BlogUser blogUser);

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("user")
    R deleteUser(@RequestParam("idList") List<Long> idList);
}
