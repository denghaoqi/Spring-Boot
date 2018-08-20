package com.base.demo.system.base.dao;

import java.util.List;

/**
 * 通用基础数据库操作接口
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/15 10:19
 */
public interface BaseDao<T> {

    /**
     * 查询单个实体
     *
     * @param entity 查询条件
     * @return
     */
    T select(T entity);

    /**
     * 查询实体列表
     *
     * @param entity 查询条件
     * @return
     */
    List<T> selectList(T entity);

    /**
     * 插入实体
     *
     * @param entity 实体插入信息
     */
    void insert(T entity);

    /**
     * 更新实体
     *
     * @param entity 实体更新信息
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
