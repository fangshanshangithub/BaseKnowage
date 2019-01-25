package com.tourism.project.entity.vo;

import com.tourism.project.constant.JsonResponseConstant;
import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 * 通用返回页面json数据
 */
public class JsonResponse<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    public JsonResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static JsonResponse success(Object data) {
        return new JsonResponse(JsonResponseConstant.CODE_SUCEESS, JsonResponseConstant.MSG_SUCEESS, data);
    }

    public static JsonResponse fail(String msg) {
        if(StringUtils.isEmpty(msg)) {
            return new JsonResponse(JsonResponseConstant.CODE_FAIL, JsonResponseConstant.MSG_FAIL);
        }
        return new JsonResponse(JsonResponseConstant.CODE_FAIL, msg);
    }

    public static JsonResponse fail() {
        return new JsonResponse(JsonResponseConstant.CODE_FAIL, JsonResponseConstant.MSG_FAIL);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
