package com.base.demo.example.service.impl;

import com.base.demo.example.dao.ExampleDao;
import com.base.demo.example.model.entity.Example;
import com.base.demo.example.service.ExampleService;
import com.base.demo.system.base.model.PageParameter;
import com.base.demo.system.base.model.PageResult;
import com.base.demo.system.base.service.impl.BaseServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 相应模块的服务实现
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/9 18:06
 */
@Service
public class ExampleServiceImpl extends BaseServiceImpl<ExampleDao,Example> implements ExampleService {

    private static final Logger logger = LoggerFactory.getLogger(ExampleServiceImpl.class);

    @Autowired
    private ExampleDao exampleDao;


    @Override
    public List<Example> examples() {
        logger.info("例子service--");
        return exampleDao.examples();
    }

    @Override
    public PageResult<Example> page(PageParameter pageParameter) {
        logger.info("分页查询例子service--");
        pageParameter.setPageNum(1);
        pageParameter.setPageSize(5);
        //排序
//        pageParameter.setOrderBy("id+0");
//        Page<Example> page = PageHelper.startPage(pageParameter.getPageNum(),pageParameter.getPageSize(),pageParameter.getOrderBy());

        Page<Example> page = PageHelper.startPage(pageParameter.getPageNum(),pageParameter.getPageSize());
        List<Example> list = examples();
        //注意：page在执行完查询后，才能获取总数和页数
        System.out.println("总数："+page.getTotal()+",页数："+page.getPages());

        PageResult<Example> pageResult = new PageResult<>(page.getPageNum(),page.getPageSize(),page.getTotal(),page.getPages());
        pageResult.setData(list);

        return pageResult;
    }
}
