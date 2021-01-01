package com.oyc.blog.article.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oyc.blog.article.dao.ArticleDao;
import com.oyc.blog.article.service.ArticleService;
import com.oyc.blog.common.domain.Article;
import org.springframework.stereotype.Service;

/**
 * 文章表(Article)表服务实现类
 *
 * @author oyc
 * @since 2020-12-31 16:47:32
 */
@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

}
