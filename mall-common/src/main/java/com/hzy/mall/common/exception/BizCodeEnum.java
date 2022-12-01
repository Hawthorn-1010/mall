package com.hzy.mall.common.exception;

/**
 * User: hzy
 * Date: 2022/12/1
 * Time: 8:16
 * Description:
 */
public enum BizCodeEnum {
    UNKNOWN_EXCEPTION(10000, "系统未知异常！"),
    VALID_EXCEPTION(10001, "参数校验不合法！");

    private Integer code;
    private String msg;

    BizCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
