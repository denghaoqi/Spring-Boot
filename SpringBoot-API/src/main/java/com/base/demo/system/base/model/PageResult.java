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
    private long itemCount;
    // 总页数
    private Integer pageCount;
    // 是否有下一页
    private Boolean isMore;
    // 开始索引
    private Integer startIndex;
    // 分页结果
    private List<T> data;

    public PageResult() {
    }

    public PageResult(Integer pageNum, Integer pageSize, long itemCount) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.itemCount = itemCount;
        this.pageCount = ((int) this.itemCount + this.pageSize - 1) / this.pageSize;
        this.startIndex = (this.pageNum - 1) * this.pageSize;
        this.isMore = this.pageNum >= this.pageCount ? false : true;
    }

    public PageResult(Integer pageNum, Integer pageSize, long itemCount, Integer pageCount) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.itemCount = itemCount;
        this.pageCount = pageCount;
        this.startIndex = (this.pageNum - 1) * this.pageSize;
        this.isMore = this.pageNum >= this.pageCount ? false : true;
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

    public long getItemCount() {
        return itemCount;
    }

    public void setItemCount(long itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
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
