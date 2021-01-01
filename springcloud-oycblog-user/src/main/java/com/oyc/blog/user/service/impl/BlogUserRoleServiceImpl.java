package com.oyc.blog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.user.dao.BlogUserRoleDao;
import com.oyc.blog.common.domain.BlogUserRole;
import com.oyc.blog.user.service.BlogUserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户与角色对应关系(BlogUserRole)表服务实现类
 *
 * @author ouyang
 * @since 2021-01-02 00:42:01
 */
@Service("blogUserRoleService")
public class BlogUserRoleServiceImpl extends ServiceImpl<BlogUserRoleDao, BlogUserRole> implements BlogUserRoleService {

}
