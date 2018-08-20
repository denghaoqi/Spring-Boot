package com.base.demo.system.exception;

import com.base.demo.system.base.model.Result;
import com.base.demo.system.base.model.ResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理控制器
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/14 11:20
 */
@ControllerAdvice
public class UnifiedExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(UnifiedExceptionHandler.class);

    @ExceptionHandler(Exception404.class)
    @ResponseBody
    public Result handlerException(Exception404 exception404){
        return ResultBuilder.notFound(exception404.getMessage());
    }



    @ExceptionHandler
    @ResponseBody
    public Result handlerException(Exception exception){
        return ResultBuilder.serverError(exception.getMessage());
    }






}
