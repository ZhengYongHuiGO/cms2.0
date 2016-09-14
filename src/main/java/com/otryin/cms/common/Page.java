package com.otryin.cms.common;

import java.util.List;

/**
 * Created by Administrator on 2016/9/7.
 */
public class Page<T> {
    private int offset;
    private int limit;
    private int totalNum;
    private int currentPage;
    private int nextPage;
    private int prePage;
    private int totalPage;
    private List<T> result;

    public Page(int offset, int limit, int totalNum,List<T> result) {
        this.offset = offset;
        this.limit = limit;
        this.totalNum = totalNum;
        this.totalPage=(int)(Math.ceil(totalNum/new Double(limit)));
        this.currentPage=offset/limit+1;
        nextPage=(currentPage+1)>totalPage?currentPage:currentPage+1;
        prePage=(currentPage-1)>0?currentPage-1:currentPage;
        this.result=result;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }


    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Page{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", totalNum=" + totalNum +
                ", totalPage=" + totalPage +
                ", prePage=" + prePage +
                ", nextPage=" + nextPage +
                ", currentPage=" + currentPage +
                ", result=" + result +
                '}';
    }
}
