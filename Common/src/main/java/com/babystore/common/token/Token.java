package com.babystore.common.token;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-29 14:07
 **/

public class Token {
    //信息--json
    private String content;
    //时间戳
    private long time;
    //唯一id  ---对应数据的主键值
    private int id;
    //随机数
    private long randomid;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getRandomid() {
        return randomid;
    }

    public void setRandomid(long randomid) {
        this.randomid = randomid;
    }

    public Token() {
    }
    public Token(String content, long time, int id,long rid) {
        this.content = content;
        this.time = time;
        this.id = id;
        randomid=rid;
    }
}

