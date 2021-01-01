package com.oyc.blog.common.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色权限对应关系(BlogRolePermission)表实体类
 *
 * @author ouyang
 * @since 2021-01-02 00:20:18
 */
@SuppressWarnings("serial")
@Data
public class BlogRolePermission extends Model<BlogRolePermission> {

     private Integer id;

     private Integer roleId;

     private Integer permissionId;


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
