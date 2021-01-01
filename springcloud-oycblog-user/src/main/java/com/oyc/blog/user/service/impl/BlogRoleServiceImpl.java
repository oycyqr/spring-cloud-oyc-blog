package com.oyc.blog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.user.dao.BlogRoleDao;
import com.oyc.blog.common.domain.BlogRole;
import com.oyc.blog.user.service.BlogRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色信息表(BlogRole)表服务实现类
 *
 * @author ouyang
 * @since 2021-01-02 00:42:01
 */
@Service("blogRoleService")
public class BlogRoleServiceImpl extends ServiceImpl<BlogRoleDao, BlogRole> implements BlogRoleService {

}
