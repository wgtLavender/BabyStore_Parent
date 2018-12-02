package com.babystore.admin.resultvo.vo;

import java.util.List;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-30 21:00
 **/
public class DivPagesVo<T> {

    private int code;
    private String msg;
    private long count;
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }


    public static <T> DivPagesVo<T> createPage(List<T> data, long count) {
        DivPagesVo<T> pageVo = new DivPagesVo<>();
        pageVo.setCode(0);
        pageVo.setMsg("OK");
        pageVo.setCount(count);
        pageVo.setData(data);
        return pageVo;
    }
}


