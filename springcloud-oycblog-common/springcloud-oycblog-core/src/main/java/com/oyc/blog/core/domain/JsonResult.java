package com.oyc.blog.core.domain;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.baomidou.mybatisplus.extension.api.R;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: oyc
 * @Date: 2020-06-05 9:48
 * @Description: http json结果集
 */
@Data
public class JsonResult extends R implements Serializable {

    /**
     * 定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 响应业务状态
     */
    private long status;

    /**
     * 响应消息
     */
    private String msg;
    /**
     * 响应中的数据
     */
    private Object data;

    public static JsonResult build(Long status, String msg, Object data) {
        return new JsonResult(status, msg, data);
    }

    public static JsonResult ok() {
        return new JsonResult(null);
    }
    public static JsonResult ok(Object data) {
        return new JsonResult(data);
    }


    public static JsonResult unAuth() {
        return new JsonResult(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), "");
    }

    public static JsonResult error() {
        return new JsonResult(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), null);
    }

    public static JsonResult error(Object msg) {
        return new JsonResult(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage(), msg);
    }

    public JsonResult() {
    }

    public static JsonResult build(Integer status, String msg) {
        return new JsonResult(ResultCode.UNAUTHORIZED.getCode(), msg, null);
    }

    public JsonResult(Long status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult(Object data) {
        this.status = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getMessage();
        this.data = data;
    }

    /**
     * 将json结果集转化为Result对象
     *
     * @param jsonData json数据 传的是Result的对象的Json字符串
     * @param clazz    TaotaoResult中的object类型
     * @return
     */
    public static JsonResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, JsonResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build((long) jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
    public static JsonResult format(String json) {
        try {
            return MAPPER.readValue(json, JsonResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     *
     * @param jsonData 传的是Result的对象的Json字符串
     *                 json数据
     * @param clazz    集合中的类型
     * @return
     */
    public static JsonResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build((long) jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }
}

