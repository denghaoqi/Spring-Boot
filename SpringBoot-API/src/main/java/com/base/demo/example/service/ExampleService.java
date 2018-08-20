package com.base.demo.example.service;

import com.base.demo.example.model.entity.Example;
import com.base.demo.system.base.model.PageParameter;
import com.base.demo.system.base.model.PageResult;
import com.base.demo.system.base.service.BaseService;

import java.util.List;

/**
 * 相应模块的服务接口
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/9 18:16
 */
public interface ExampleService extends BaseService<Example> {

    /**
     * 列表查询例子
     * @return
     */
    List<Example> examples();

    /**
     * 分页查询例子
     * @return
     */
    PageResult<Example> page(PageParameter pageParameter);
}
