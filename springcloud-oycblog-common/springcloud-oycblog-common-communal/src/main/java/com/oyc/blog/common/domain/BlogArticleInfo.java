package com.oyc.blog.common.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章表(BlogArticleInfo)表实体类
 *
 * @author oyc
 * @since 2020-12-31 16:47:34
 */
@SuppressWarnings("serial")
@Data
@TableName("blog_article_info")
public class BlogArticleInfo extends Model<BlogArticleInfo> {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 作者昵称
     */
    private String nickname;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章摘要
     */
    private String summary;

    /**
     * 浏览数
     */
    private Integer viewNum;

    /**
     * 文章分类ID
     */
    private Integer categoryId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态
     */
    private Object status;


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
