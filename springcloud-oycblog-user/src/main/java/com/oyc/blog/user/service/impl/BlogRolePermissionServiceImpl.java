package com.oyc.blog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.user.dao.BlogRolePermissionDao;
import com.oyc.blog.common.domain.BlogRolePermission;
import com.oyc.blog.user.service.BlogRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * 角色权限对应关系(BlogRolePermission)表服务实现类
 *
 * @author ouyang
 * @since 2021-01-02 00:42:01
 */
@Service("blogRolePermissionService")
public class BlogRolePermissionServiceImpl extends ServiceImpl<BlogRolePermissionDao, BlogRolePermission> implements BlogRolePermissionService {

}
