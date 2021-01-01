package com.oyc.blog.common.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.oyc.blog.core.domain.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 文章表(Article)表实体类
 *
 * @author oyc
 * @since 2020-12-31 16:47:28
 */
@Data
@TableName("blog_article")
public class Article extends BaseEntity {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 博客ID
     */
    private Integer blogId;

    /**
     * 文章内容txt
     */
    private Object content;

    /**
     * 文章内容html
     */
    private Object contentHtml;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
