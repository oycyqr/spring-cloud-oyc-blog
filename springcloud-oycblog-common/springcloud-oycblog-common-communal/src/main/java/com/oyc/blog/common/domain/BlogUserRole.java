package com.oyc.blog.common.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户与角色对应关系(BlogUserRole)表实体类
 *
 * @author ouyang
 * @since 2021-01-02 00:20:18
 */
@SuppressWarnings("serial")
@Data
public class BlogUserRole extends Model<BlogUserRole> {

     private Long id;

    /**
     * 用户ID
     */
     private Long userId;

    /**
     * 角色ID
     */
     private Long roleId;


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
