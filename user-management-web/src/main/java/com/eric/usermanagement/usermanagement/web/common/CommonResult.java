package com.eric.usermanagement.usermanagement.web.common;

import lombok.Data;

@Data
public class CommonResult<T> {

    private Boolean success;
    private String code;
    private String msg;
    private T data;


    public CommonResult<T> buildData(T t) {
        this.data = t;
        return this;
    }

    public CommonResult<T> buildMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public CommonResult<T> buildCode(String code) {
        this.msg = msg;
        return this;
    }
}
