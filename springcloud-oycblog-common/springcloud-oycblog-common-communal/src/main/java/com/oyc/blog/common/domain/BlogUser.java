package com.oyc.blog.common.domain;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户表(BlogUser)表实体类
 *
 * @author ouyang
 * @since 2021-01-02 00:20:18
 */
@SuppressWarnings("serial")
@Data
public class BlogUser extends Model<BlogUser> {

    /**
     * 主键ID
     */
     private Integer id;

    /**
     * 登录账号
     */
     private String account;

    /**
     * 密码
     */
     private String password;

    /**
     * 盐
     */
     private String salt;

    /**
     * 邮箱
     */
     private String email;

    /**
     * 手机号
     */
     private String phone;

    /**
     * 上次登录时间
     */
     private Date lastLoginTime;

    /**
     * 用户昵称
     */
     private String nickname;

    /**
     * 用户头像
     */
     private String avatar;

    /**
     * 是否admin，0不是，1是
     */
     private Integer admin;

    /**
     * 用户状态
     */
     private Integer status;

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
