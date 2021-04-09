package com.eric.usermanagement.usermanagement.web.common.enums;

public enum ResultCodeEnum {
    SUCCESS(200, "成功");

    ResultCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Integer code;
    private String desc;
}
