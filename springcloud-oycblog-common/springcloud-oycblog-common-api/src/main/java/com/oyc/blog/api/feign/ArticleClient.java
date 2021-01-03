package com.oyc.blog.api.feign;

import com.baomidou.mybatisplus.extension.api.R;
import com.oyc.blog.api.fallback.ArticleClientFallback;
import com.oyc.blog.common.domain.Article;
import com.oyc.blog.common.domain.BlogArticleInfo;
import com.oyc.blog.common.domain.BlogArticleTag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/1 11:28 下午
 */
@FeignClient(value = "springcloud-oycblog-article",fallback = ArticleClientFallback.class)
public interface ArticleClient {

    @GetMapping("/hello")
    R hello();

    /**
     * 分页查询所有数据
     *
     * @return 所有数据
     */
    @GetMapping("article/list")
    R list();

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("article/{id}")
    R selectOneArticle(@PathVariable Serializable id);

    /**
     * 新增数据
     *
     * @param article 实体对象
     * @return 新增结果
     */
    @PostMapping("article")
    R insertArticle(@RequestBody Article article);

    /**
     * 修改数据
     *
     * @param article 实体对象
     * @return 修改结果
     */
    @PutMapping("article")
    R updateArticle(@RequestBody Article article);

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("article")
    R deleteArticle(@RequestParam("idList") List<Long> idList);


    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param blogArticleInfo 查询实体
     * @return 所有数据
     */
//    @GetMapping("articleInfo")
   // R selectAllArticleInfo(Page<BlogArticleInfo> page, BlogArticleInfo blogArticleInfo);

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("articleInfo/{id}")
    R selectOneArticleInfo(@PathVariable Serializable id);

    /**
     * 新增数据
     *
     * @param blogArticleInfo 实体对象
     * @return 新增结果
     */
    @PostMapping("articleInfo")
    R insertArticleInfo(@RequestBody BlogArticleInfo blogArticleInfo);

    /**
     * 修改数据
     *
     * @param blogArticleInfo 实体对象
     * @return 修改结果
     */
    @PutMapping("articleInfo")
    R updateArticleInfo(@RequestBody BlogArticleInfo blogArticleInfo);

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("articleInfo")
    R deleteArticleInfo(@RequestParam("idList") List<Long> idList);


    /**
     * 分页查询所有数据
     *
     * @param page           分页对象
     * @param blogArticleTag 查询实体
     * @return 所有数据
     */
//    @GetMapping("articleTag")
//    R selectAllTag(Page<BlogArticleTag> page, BlogArticleTag blogArticleTag);

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("articleTag/{id}")
    R selectOneTag(@PathVariable Serializable id);

    /**
     * 新增数据
     *
     * @param blogArticleTag 实体对象
     * @return 新增结果
     */
    @PostMapping("articleTag")
    R insertTag(@RequestBody BlogArticleTag blogArticleTag);

    /**
     * 修改数据
     *
     * @param blogArticleTag 实体对象
     * @return 修改结果
     */
    @PutMapping("articleTag")
    R updateTag(@RequestBody BlogArticleTag blogArticleTag);

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping("articleTag")
    R deleteTag(@RequestParam("idList") List<Long> idList);
}
