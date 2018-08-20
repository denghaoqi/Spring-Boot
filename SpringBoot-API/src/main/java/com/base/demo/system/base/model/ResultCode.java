package com.base.demo.system.base.model;

/**
 * 响应状态编码
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/9 17:13
 */
public enum ResultCode {
    /**
     * 成功
     */
    SUCCESS(200, "执行成功!"),

    /**
     * 参数校验不通过
     */
    FAIL(400, "参数校验不通过!"),

    /**
     * 鉴权不通过
     */
    UNAUTHORIZED(401, "鉴权不通过！"),

    /**
     * 无权限操作
     */
    FORBIDDEN(403, "无权限操作！"),

    /**
     * 资源不存在
     */
    NOT_FOUND(404, "资源不存在！"),

    /**
     * 该数据不存在
     */
    NOT_EXIST_DATA(410, "该数据不存在！"),

    /**
     * 不支持的数据类型
     */
    VALID_FAIL(415, "不支持的数据类型！"),

    /**
     * 数据已存在
     */
    EXIST_DATA(417, "该数据已存在！"),

    /**
     * 服务器内部错误
     */
    SERVER_ERROR(500, "服务器内部错误！");


    private int status;
    private String message;


    ResultCode(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int status(){
        return status;
    }

    public String message(){
        return message;
    }
}
