package com.base.demo.system.base.service;

import com.base.demo.system.base.model.BaseModel;
import com.base.demo.system.base.model.PageParameter;
import com.base.demo.system.base.model.PageResult;

import java.util.List;

/**
 * 通用基础服务类接口
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/14 17:53
 */
public interface BaseService<T extends BaseModel> {

    /**
     * 获取单个实体信息
     *
     * @param entity 实体的查询条件
     * @return
     */
    T get(T entity);

    /**
     * 获取实例列表信息
     *
     * @param entity 实体的查询条件
     * @return
     */
    List<T> findAll(T entity);

    /**
     * 获取实例分页信息
     *
     * @param entity        实体的查询条件
     * @param pageParameter 分页条件
     * @return
     */
    PageResult<T> page(T entity, PageParameter pageParameter);

    /**
     * 保存实体
     *
     * @param entity 实体保存信息
     */
    void save(T entity);

    /**
     * 更新实体
     *
     * @param entity 实体的更新信息（主键id是必须的）
     */
    void update(T entity);

    /**
     * 删除实体(硬删除，直接删除数据库数据)
     *
     * @param entity 删除实体的条件
     */
    void delete(T entity);

    /**
     * 无效实体（软删除，不删除数据库的数据）
     *
     * @param entity 修改成无效的实体条件
     */
    void invalid(T entity);


}
