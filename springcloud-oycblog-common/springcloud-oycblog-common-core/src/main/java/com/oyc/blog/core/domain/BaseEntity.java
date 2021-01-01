package com.oyc.blog.core.domain;

/**
 * @Description:Entity基类
 * @Author oyc
 * @Date 2021/1/1 2:33 下午
 */

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

public class BaseEntity extends Model<BaseEntity> implements Serializable {
    private static final long serialVersionUID = 1L;
}
