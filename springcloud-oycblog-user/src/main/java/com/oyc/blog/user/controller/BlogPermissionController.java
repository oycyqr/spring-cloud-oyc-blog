package com.oyc.blog.user.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oyc.blog.common.domain.BlogPermission;
import com.oyc.blog.user.service.BlogPermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 权限表(BlogPermission)表控制层
 *
 * @author ouyang
 * @since 2021-01-02 00:41:59
 */
@RestController
@RequestMapping("permission")
public class BlogPermissionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BlogPermissionService blogPermissionService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param blogPermission 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<BlogPermission> page, BlogPermission blogPermission) {
        return success(this.blogPermissionService.page(page, new QueryWrapper<>(blogPermission)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.blogPermissionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param blogPermission 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody BlogPermission blogPermission) {
        return success(this.blogPermissionService.save(blogPermission));
    }

    /**
     * 修改数据
     *
     * @param blogPermission 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody BlogPermission blogPermission) {
        return success(this.blogPermissionService.updateById(blogPermission));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.blogPermissionService.removeByIds(idList));
    }
}
