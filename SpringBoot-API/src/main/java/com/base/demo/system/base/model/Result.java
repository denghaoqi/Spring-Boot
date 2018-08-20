package com.base.demo.system.base.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 响应结果实体
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/9 17:12
 */
public class Result<T> implements Serializable {

    private int status;//相应状态码
    private String desc;//描述
    private Date time=new Date();//时间戳，可选
    private T data;//返回数据

    public Result() {
    }

    public Result(T data) {
        this.status = ResultCode.SUCCESS.status();
        this.desc = ResultCode.SUCCESS.message();
        this.data = data;
    }

    public Result(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public Result(int status, String desc, T data) {
        this.status = status;
        this.desc = desc;
        this.data = data;
    }

    /**
     * 设置返回状态码
     *
     * @param status  返回状态码
     * @return        返回实体
     */
    public Result setCode(int status) {
        this.status = status;
        return this;
    }

    /**
     * 设置返回信息
     *
     * @param message  返回信息
     * @return         返回实体
     */
    public Result setMessage(String message) {
        this.desc = message;
        return this;
    }

    /**
     * 设置返回数据
     *
     * @param data 返回数据
     * @return     返回实体
     */
    public Result setResult(T data) {
        this.data = data;
        return this;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", desc='" + desc + '\'' +
                ", time=" + time +'\''+
                ", data=" + data +
                '}';
    }
}
