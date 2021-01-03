package com.oyc.blog.api.fallback;

import com.baomidou.mybatisplus.extension.api.R;
import com.oyc.blog.api.feign.ArticleClient;
import com.oyc.blog.common.domain.Article;
import com.oyc.blog.common.domain.BlogArticleInfo;
import com.oyc.blog.common.domain.BlogArticleTag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * 文章服务容错
 */
@Component
@Slf4j
public class ArticleClientFallback implements ArticleClient {

    @Override
    public R hello() {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");
    }

    @Override
    public R list() {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R selectOneArticle(Serializable id) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R insertArticle(Article article) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R updateArticle(Article article) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R deleteArticle(List<Long> idList) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R selectOneArticleInfo(Serializable id) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R insertArticleInfo(BlogArticleInfo blogArticleInfo) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R updateArticleInfo(BlogArticleInfo blogArticleInfo) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R deleteArticleInfo(List<Long> idList) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R selectOneTag(Serializable id) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R insertTag(BlogArticleTag blogArticleTag) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R updateTag(BlogArticleTag blogArticleTag) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }

    @Override
    public R deleteTag(List<Long> idList) {
        return R.failed("服务出现异常, 服务降级返回,方法执行失败");

    }
}
