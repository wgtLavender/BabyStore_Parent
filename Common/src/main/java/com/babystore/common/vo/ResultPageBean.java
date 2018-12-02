package com.babystore.common.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-28 19:56
 **/

public class ResultPageBean implements Serializable {
    private Integer code;
    private String msg;
    List<Object> data;
    //总页数
    private Integer totalPage;
    //总数据
    private Integer totalCount;
    //当前页码
    private Integer currPage;
    private Integer limit;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "ResultPageBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", totalPage=" + totalPage +
                ", totalCount=" + totalCount +
                ", currPage=" + currPage +
                ", limit=" + limit +
                '}';
    }
}

