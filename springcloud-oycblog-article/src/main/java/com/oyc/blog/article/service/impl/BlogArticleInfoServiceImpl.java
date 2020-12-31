package com.oyc.blog.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.article.dao.BlogArticleInfoDao;
import com.oyc.blog.article.entity.BlogArticleInfo;
import com.oyc.blog.article.service.BlogArticleInfoService;
import org.springframework.stereotype.Service;

/**
 * 文章表(BlogArticleInfo)表服务实现类
 *
 * @author oyc
 * @since 2020-12-31 16:47:35
 */
@Service("blogArticleInfoService")
public class BlogArticleInfoServiceImpl extends ServiceImpl<BlogArticleInfoDao, BlogArticleInfo> implements BlogArticleInfoService {

}
