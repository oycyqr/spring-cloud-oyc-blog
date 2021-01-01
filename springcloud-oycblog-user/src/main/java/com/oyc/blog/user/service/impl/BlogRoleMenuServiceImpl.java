package com.oyc.blog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.user.dao.BlogRoleMenuDao;
import com.oyc.blog.common.domain.BlogRoleMenu;
import com.oyc.blog.user.service.BlogRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * 角色与菜单对应关系(BlogRoleMenu)表服务实现类
 *
 * @author ouyang
 * @since 2021-01-02 00:42:01
 */
@Service("blogRoleMenuService")
public class BlogRoleMenuServiceImpl extends ServiceImpl<BlogRoleMenuDao, BlogRoleMenu> implements BlogRoleMenuService {

}
