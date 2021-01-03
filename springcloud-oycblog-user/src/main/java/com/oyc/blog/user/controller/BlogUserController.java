package com.oyc.blog.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oyc.blog.common.domain.BlogUser;
import com.oyc.blog.user.service.BlogUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 用户表(BlogUser)表控制层
 *
 * @author ouyang
 * @since 2021-01-02 00:42:01
 */
@RestController
@RequestMapping("user")
public class BlogUserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BlogUserService blogUserService;

    @GetMapping("list")
    public R list() {
        return success(this.blogUserService.list());
    }


    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param blogUser 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<BlogUser> page, BlogUser blogUser) {
        return success(this.blogUserService.page(page, new QueryWrapper<>(blogUser)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.blogUserService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param blogUser 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody BlogUser blogUser) {
        return success(this.blogUserService.save(blogUser));
    }

    /**
     * 修改数据
     *
     * @param blogUser 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody BlogUser blogUser) {
        return success(this.blogUserService.updateById(blogUser));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.blogUserService.removeByIds(idList));
    }
}
