package com.base.demo.system.exception;

/**
 * 资源不存在异常
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/15 16:17
 */
public class Exception404 extends RuntimeException {

    public Exception404() {
    }

    public Exception404(String message) {
        super(message);
    }

    public Exception404(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception404(Throwable cause) {
        super(cause);
    }

}
