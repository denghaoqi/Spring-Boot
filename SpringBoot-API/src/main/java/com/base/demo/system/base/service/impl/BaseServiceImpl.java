package com.base.demo.system.base.service.impl;

import com.base.demo.system.base.dao.BaseDao;
import com.base.demo.system.base.model.BaseModel;
import com.base.demo.system.base.model.PageParameter;
import com.base.demo.system.base.model.PageResult;
import com.base.demo.system.base.service.BaseService;
import com.base.demo.system.utils.UUIDUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 通用基础服务类接口实现
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/15 10:17
 */
public class BaseServiceImpl<D extends BaseDao<T>, T extends BaseModel> implements BaseService<T> {

    @Autowired
    D dao;

    @Override
    public T get(T entity) {
        return dao.select(entity);
    }

    @Override
    public List<T> findAll(T entity) {
        return dao.selectList(entity);
    }

    @Override
    public PageResult<T> page(T entity, PageParameter pageParameter) {
        Page<T> page = PageHelper.startPage(pageParameter.getPageNum(), pageParameter.getPageSize());
        List<T> list = dao.selectList(entity);
        PageResult<T> pageResult = new PageResult<>(page.getPageNum(), page.getPageSize(), page.getTotal(), page.getPages());
        pageResult.setData(list);
        return pageResult;
    }

    @Override
    public void save(T entity) {
        entity.setId(UUIDUtil.getUUID());
        entity.setGmtCreate(new Date());
        entity.setIsVaild(1);
        dao.insert(entity);
    }

    @Override
    public void update(T entity) {
        entity.setGmtModified(new Date());
        dao.insert(entity);
    }

    @Override
    public void delete(T entity) {
        dao.delete(entity);
    }

    @Override
    public void invalid(T entity) {
        entity.setIsVaild(0);
        dao.insert(entity);
    }
}
