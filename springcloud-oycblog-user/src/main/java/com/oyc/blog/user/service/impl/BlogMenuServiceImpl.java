package com.oyc.blog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.user.dao.BlogMenuDao;
import com.oyc.blog.common.domain.BlogMenu;
import com.oyc.blog.user.service.BlogMenuService;
import org.springframework.stereotype.Service;

/**
 * 菜单权限表(BlogMenu)表服务实现类
 *
 * @author ouyang
 * @since 2021-01-02 00:41:45
 */
@Service("blogMenuService")
public class BlogMenuServiceImpl extends ServiceImpl<BlogMenuDao, BlogMenu> implements BlogMenuService {

}
