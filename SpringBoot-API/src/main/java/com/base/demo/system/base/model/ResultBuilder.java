package com.base.demo.system.base.model;

/**
 * 响应结果实体生成器
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/13 17:46
 */
public class ResultBuilder {

    /**
     * 执行成功（默认信息），无数据
     *
     * @return 响应结果实体
     */
    public static Result success() {
        return new Result()
                .setCode(ResultCode.SUCCESS.status())
                .setMessage(ResultCode.SUCCESS.message());
    }

    /**
     * 执行成功（自定义返回信息），无数据
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result success(String message) {
        return new Result()
                .setCode(ResultCode.SUCCESS.status())
                .setMessage(message);
    }

    /**
     * 执行成功，有数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result success(T data) {
        return new Result<T>()
                .setCode(ResultCode.SUCCESS.status())
                .setMessage(ResultCode.SUCCESS.message())
                .setResult(data);
    }

    /**
     * 参数校验不通过（默认信息）
     *
     * @return 响应结果实体
     */
    public static Result fail() {
        return new Result()
                .setCode(ResultCode.FAIL.status())
                .setMessage(ResultCode.FAIL.message());
    }

    /**
     * 参数校验不通过（自定义信息）
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result fail(String message) {
        return new Result()
                .setCode(ResultCode.FAIL.status())
                .setMessage(message);
    }

    /**
     * 参数校验不通过,有返回数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result fail(T data) {
        return new Result()
                .setCode(ResultCode.FAIL.status())
                .setMessage(ResultCode.FAIL.message())
                .setResult(data);
    }

    /**
     * 鉴权不通过（默认信息）
     *
     * @return 响应结果实体
     */
    public static Result unauthorized() {
        return new Result()
                .setCode(ResultCode.UNAUTHORIZED.status())
                .setMessage(ResultCode.UNAUTHORIZED.message());
    }

    /**
     * 鉴权不通过（自定义信息）
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result unauthorized(String message) {
        return new Result()
                .setCode(ResultCode.UNAUTHORIZED.status())
                .setMessage(message);
    }

    /**
     * 鉴权不通过,有返回数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result unauthorized(T data) {
        return new Result()
                .setCode(ResultCode.UNAUTHORIZED.status())
                .setMessage(ResultCode.UNAUTHORIZED.message())
                .setResult(data);
    }

    /**
     * 无权限操作（默认信息）
     *
     * @return 响应结果实体
     */
    public static Result forbidden() {
        return new Result()
                .setCode(ResultCode.FORBIDDEN.status())
                .setMessage(ResultCode.FORBIDDEN.message());
    }

    /**
     * 无权限操作（自定义信息）
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result forbidden(String message) {
        return new Result()
                .setCode(ResultCode.FORBIDDEN.status())
                .setMessage(message);
    }

    /**
     * 无权限操作,有返回数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result forbidden(T data) {
        return new Result()
                .setCode(ResultCode.FORBIDDEN.status())
                .setMessage(ResultCode.FORBIDDEN.message())
                .setResult(data);
    }

    /**
     * 资源不存在（默认信息）
     *
     * @return 响应结果实体
     */
    public static Result notFound() {
        return new Result()
                .setCode(ResultCode.NOT_FOUND.status())
                .setMessage(ResultCode.NOT_FOUND.message());
    }

    /**
     * 资源不存在（自定义信息）
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result notFound(String message) {
        return new Result()
                .setCode(ResultCode.NOT_FOUND.status())
                .setMessage(message);
    }

    /**
     * 资源不存在,有返回数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result notFound(T data) {
        return new Result()
                .setCode(ResultCode.NOT_FOUND.status())
                .setMessage(ResultCode.NOT_FOUND.message())
                .setResult(data);
    }

    /**
     * 服务器内部错误（默认信息）
     *
     * @return 响应结果实体
     */
    public static Result serverError() {
        return new Result()
                .setCode(ResultCode.SERVER_ERROR.status())
                .setMessage(ResultCode.SERVER_ERROR.message());
    }

    /**
     * 服务器内部错误（自定义信息）
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result serverError(String message) {
        return new Result()
                .setCode(ResultCode.SERVER_ERROR.status())
                .setMessage(message);
    }

    /**
     * 服务器内部错误,有返回数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result serverError(T data) {
        return new Result()
                .setCode(ResultCode.SERVER_ERROR.status())
                .setMessage(ResultCode.SERVER_ERROR.message())
                .setResult(data);
    }

    /**
     * 不支持的数据类型（默认信息）
     *
     * @return 响应结果实体
     */
    public static Result validFail() {
        return new Result()
                .setCode(ResultCode.VALID_FAIL.status())
                .setMessage(ResultCode.VALID_FAIL.message());
    }

    /**
     * 不支持的数据类型（自定义信息）
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result validFail(String message) {
        return new Result()
                .setCode(ResultCode.VALID_FAIL.status())
                .setMessage(message);
    }

    /**
     * 不支持的数据类型,有返回数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result validFail(T data) {
        return new Result()
                .setCode(ResultCode.VALID_FAIL.status())
                .setMessage(ResultCode.VALID_FAIL.message())
                .setResult(data);
    }

    /**
     * 该数据不存在（默认信息）
     *
     * @return 响应结果实体
     */
    public static Result notExistData() {
        return new Result()
                .setCode(ResultCode.NOT_EXIST_DATA.status())
                .setMessage(ResultCode.NOT_EXIST_DATA.message());
    }

    /**
     * 该数据不存在（自定义信息）
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result notExistData(String message) {
        return new Result()
                .setCode(ResultCode.NOT_EXIST_DATA.status())
                .setMessage(message);
    }

    /**
     * 该数据不存在,有返回数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result notExistData(T data) {
        return new Result()
                .setCode(ResultCode.NOT_EXIST_DATA.status())
                .setMessage(ResultCode.NOT_EXIST_DATA.message())
                .setResult(data);
    }

    /**
     * 数据已存在（默认信息）
     *
     * @return 响应结果实体
     */
    public static Result existData() {
        return new Result()
                .setCode(ResultCode.EXIST_DATA.status())
                .setMessage(ResultCode.EXIST_DATA.message());
    }

    /**
     * 数据已存在（自定义信息）
     *
     * @param message 返回信息
     * @return 响应结果实体
     */
    public static Result existData(String message) {
        return new Result()
                .setCode(ResultCode.EXIST_DATA.status())
                .setMessage(message);
    }

    /**
     * 数据已存在,有返回数据
     *
     * @param data 返回数据
     * @return 响应结果实体
     */
    public static <T> Result existData(T data) {
        return new Result()
                .setCode(ResultCode.EXIST_DATA.status())
                .setMessage(ResultCode.EXIST_DATA.message())
                .setResult(data);
    }

}
