package com.base.demo.example.dao;

import com.base.demo.example.model.entity.Example;
import com.base.demo.system.base.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 相应模块的数据库操作
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/9 18:06
 */
@Mapper
public interface ExampleDao extends BaseDao<Example> {

    /**
     * 列表查询例子
     * @return
     */
    List<Example> examples();

}
