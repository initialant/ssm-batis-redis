package com.xxx.pojo;

public class PageSolve {
    private int count;
    private int pageCount;
    private int page;
    private int curr;  //起始页

    @Override
    public String toString() {
        return "PageSolve{" +
                "count=" + count +
                ", pageCount=" + pageCount +
                ", page=" + page +
                ", curr=" + curr +
                '}';
    }

    public int getCurr() {
        return curr;
    }

    public void setCurr(int curr) {
        this.curr = curr;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
