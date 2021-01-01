package com.oyc.blog.common.domain;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;

/**
 * 角色信息表(BlogRole)表实体类
 *
 * @author ouyang
 * @since 2021-01-02 00:20:18
 */
@SuppressWarnings("serial")
@Data
public class BlogRole extends Model<BlogRole> {

    /**
     * 角色ID
     */
     private Integer roleId;

    /**
     * 角色名称
     */
     private String roleName;

    /**
     * 角色权限字符串
     */
     private String roleKey;

    /**
     * 显示顺序
     */
     private Integer roleSort;

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限）
     */
     private String dataScope;

    /**
     * 角色状态（0正常 1停用）
     */
     private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
     private String delFlag;

    /**
     * 创建者
     */
     private String createBy;

    /**
     * 创建时间
     */
     private Date createTime;

    /**
     * 更新者
     */
     private String updateBy;

    /**
     * 更新时间
     */
     private Date updateTime;

    /**
     * 备注
     */
     private String remark;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }
    }
