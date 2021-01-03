package com.oyc.blog.search.repository;

import com.oyc.blog.search.document.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/3 10:00 上午
 */
@Repository
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, Integer> {

    /**
     * 根据title或者内容分页查询
     *
     * @param title   标题
     * @param content 内容
     * @param page    分页
     * @return
     */
    Page<EsBlog> findByTitleOrContentLike(String title, String content, Pageable page);
}
