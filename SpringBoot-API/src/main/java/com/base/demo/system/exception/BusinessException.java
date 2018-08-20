package com.base.demo.system.exception;

import com.base.demo.system.base.model.ResultCode;

/**
 * 业务异常，在service层抛出异常
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/16 16:32
 */
public class BusinessException extends RuntimeException {

    private int code;

    private String message;

    public BusinessException() {
    }

    public BusinessException(ResultCode resultCode){
        this.code = resultCode.status();
        this.message = resultCode.message();
    }

    public BusinessException(int code,String message){
        super(message);
        this.code = code;
        this.message = message;
    }

    public BusinessException(String message) {
        super(message);
        this.code = ResultCode.SERVER_ERROR.status();
        this.message = message;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.code = ResultCode.SERVER_ERROR.status();
        this.message = message;
    }

    public BusinessException(Throwable cause) {
        super(cause);
        this.code = ResultCode.SERVER_ERROR.status();
        this.message = ResultCode.SERVER_ERROR.message();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
