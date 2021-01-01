package com.oyc.blog.common.domain;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色与菜单对应关系(BlogRoleMenu)表实体类
 *
 * @author ouyang
 * @since 2021-01-02 00:20:12
 */
@SuppressWarnings("serial")
@Data
public class BlogRoleMenu extends Model<BlogRoleMenu> {

     private Long id;

    /**
     * 角色ID
     */
     private Long roleId;

    /**
     * 菜单ID
     */
     private Long menuId;


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
