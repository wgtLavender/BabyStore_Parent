package com.babystore.admin.resultvo.vo;


import com.babystore.admin.pojo.Permissions;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/8/14 15:49
 */
public class MenuVo {
    private Permissions parent;
    private List<Permissions> childrens;
    public Permissions getParent() {
        return parent;
    }

    public void setParent(Permissions parent) {
        this.parent = parent;
    }

    public List<Permissions> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Permissions> childrens) {
        this.childrens = childrens;
    }
}
