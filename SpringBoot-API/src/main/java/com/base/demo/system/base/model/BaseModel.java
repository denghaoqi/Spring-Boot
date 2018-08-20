package com.base.demo.system.base.model;

import java.util.Date;

/**
 * 通用基础实体
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/14 17:54
 */
public class BaseModel {

    //主键id
    private String id;

    //创建时间
    private Date gmtCreate;

    //创建人
    private String createUser;

    //修改时间
    private Date gmtModified;

    //修改人
    private String modifiedUser;

    //是否有效 0-无效 ，1-有效，用作软删除
    private Integer isVaild;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Integer getIsVaild() {
        return isVaild;
    }

    public void setIsVaild(Integer isVaild) {
        this.isVaild = isVaild;
    }
}
