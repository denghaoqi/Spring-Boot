package com.base.demo.example.model.entity;

import com.base.demo.system.base.model.BaseModel;

/**
 * 例子实体，与数据库表一一对应
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/14 10:49
 */
public class Example extends BaseModel {

    private String testName;//测试名称

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

}
