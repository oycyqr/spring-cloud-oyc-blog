package com.oyc.blog.article.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章标签表对应表(BlogArticleTag)表实体类
 *
 * @author oyc
 * @since 2020-12-31 16:47:35
 */
@SuppressWarnings("serial")
@Data
@TableName("blog_article_tag")
public class BlogArticleTag extends Model<BlogArticleTag> {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 标签ID
     */
    private Integer tagId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


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
