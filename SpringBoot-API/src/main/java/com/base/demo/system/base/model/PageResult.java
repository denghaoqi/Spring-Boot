package com.base.demo.system.base.model;

import java.util.List;

/**
 * 分页结果实体
 *
 * @author denghq
 * @version v1.0
 * @date 2018/8/14 16:23
 */
public class PageResult<T> {

    // 当前页
    private Integer pageNum = 1;
    // 每页显示的总条数
    private Integer pageSize = 10;
    // 总条数
    private long total;
    // 总页数
    private Integer totalPage;
    // 是否有下一页
    private Boolean isMore;
    // 开始索引
    private Integer startIndex;
    // 分页结果
    private List<T> data;

    public PageResult() {
    }

    public PageResult(Integer pageNum, Integer pageSize, long total) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.totalPage = ((int) this.total + this.pageSize - 1) / this.pageSize;
        this.startIndex = (this.pageNum - 1) * this.pageSize;
        this.isMore = this.pageNum >= this.totalPage ? false : true;
    }

    public PageResult(Integer pageNum, Integer pageSize, long total, Integer totalPage) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.totalPage = totalPage;
        this.startIndex = (this.pageNum - 1) * this.pageSize;
        this.isMore = this.pageNum >= this.totalPage ? false : true;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Boolean getMore() {
        return isMore;
    }

    public void setMore(Boolean more) {
        isMore = more;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
