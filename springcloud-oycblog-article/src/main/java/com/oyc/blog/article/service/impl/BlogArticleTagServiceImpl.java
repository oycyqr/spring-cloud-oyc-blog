package com.oyc.blog.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.article.dao.BlogArticleTagDao;
import com.oyc.blog.common.domain.BlogArticleTag;
import com.oyc.blog.article.service.BlogArticleTagService;
import org.springframework.stereotype.Service;

/**
 * 文章标签表对应表(BlogArticleTag)表服务实现类
 *
 * @author oyc
 * @since 2020-12-31 16:47:35
 */
@Service("blogArticleTagService")
public class BlogArticleTagServiceImpl extends ServiceImpl<BlogArticleTagDao, BlogArticleTag> implements BlogArticleTagService {

}
