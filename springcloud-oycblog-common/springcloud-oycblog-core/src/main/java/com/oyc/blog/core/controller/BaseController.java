package com.oyc.blog.core.controller;

import com.oyc.blog.core.domain.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Author oyc
 * @Date 2021/1/1 2:21 下午
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected JsonResult toAjax(int rows) {
        return rows > 0 ? JsonResult.ok() : JsonResult.error();
    }

}
