package com.oyc.blog.common.domain;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;

/**
 * 权限表(BlogPermission)表实体类
 *
 * @author ouyang
 * @since 2021-01-02 00:20:18
 */
@SuppressWarnings("serial")
@Data
public class BlogPermission extends Model<BlogPermission> {

    /**
     * id

     */
     private Integer id;

    /**
     * 权限
     */
     private String perms;

    /**
     * 创建人
     */
     private Integer creater;

    /**
     * 创建时间
     */
     private Date createTime;

    /**
     * 修改时间
     */
     private Date updateTime;

    /**
     * 状态
     */
     private Integer status;


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
