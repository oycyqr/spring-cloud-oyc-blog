package com.oyc.blog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.user.dao.BlogPermissionDao;
import com.oyc.blog.common.domain.BlogPermission;
import com.oyc.blog.user.service.BlogPermissionService;
import org.springframework.stereotype.Service;

/**
 * 权限表(BlogPermission)表服务实现类
 *
 * @author ouyang
 * @since 2021-01-02 00:41:52
 */
@Service("blogPermissionService")
public class BlogPermissionServiceImpl extends ServiceImpl<BlogPermissionDao, BlogPermission> implements BlogPermissionService {

}
