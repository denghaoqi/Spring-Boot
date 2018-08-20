package com.base.demo.example.controller;

import com.base.demo.example.model.entity.Example;
import com.base.demo.example.service.ExampleService;
import com.base.demo.system.base.model.PageParameter;
import com.base.demo.system.base.model.PageResult;
import com.base.demo.system.base.model.Result;
import com.base.demo.system.base.model.ResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 相应模块的Restful api接口控制器
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/9 18:03
 */
@RestController
@RequestMapping("/api/example")
public class ExampleController {

    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @Autowired
    private ExampleService exampleService;

    /**
     * 查询列表
     * @return
     */
    @RequestMapping("/examples")
    public Result examples(){
//        Result<List> result = new Result<>();
        List<Example> list = exampleService.examples();
        logger.info("查询test，list："+list.toString());
//        result= ResultBuilder.success(list);
        return ResultBuilder.success(list);
    }

    @RequestMapping("/page")
    public Result page(PageParameter pageParameter){
        PageResult<Example> page = exampleService.page(pageParameter);
        logger.info("分页查询，list："+page.toString());
        return ResultBuilder.success(page);
    }
}
