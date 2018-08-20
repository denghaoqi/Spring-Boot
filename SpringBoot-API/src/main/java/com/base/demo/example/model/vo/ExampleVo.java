package com.base.demo.example.model.vo;

/**
 * 例子视图实体，可以根据页面所以需要参数对实体进行增加或者删减.
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/14 10:50
 */
public class ExampleVo {

    private String id;//id
    private String testName;//测试名称

    //页面所属要的参数
    private String view;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

}
