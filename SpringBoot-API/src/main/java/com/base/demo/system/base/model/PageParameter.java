package com.base.demo.system.base.model;

/**
 * 分页参数实体
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/14 15:38
 */
public class PageParameter {

    private Integer pageNum; //页码

    private Integer pageSize; //每一页大小

    private String orderBy; //排序的字符串

    public Integer getPageNum() {
        if (pageNum == null) {
            return 1;
        }
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        if (pageSize == null) {
            return 10;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
