package com.oyc.blog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.user.dao.BlogUserDao;
import com.oyc.blog.common.domain.BlogUser;
import com.oyc.blog.user.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户表(BlogUser)表服务实现类
 *
 * @author ouyang
 * @since 2021-01-02 00:42:01
 */
@Service("blogUserService")
public class BlogUserServiceImpl extends ServiceImpl<BlogUserDao, BlogUser> implements BlogUserService {

}
