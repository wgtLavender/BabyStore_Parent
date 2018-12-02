package com.babystore.common.constant;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-28 20:23
 **/

public class Constants {
    public static final Integer ROK = 100000;
    public static final Integer RERROR2 = 100001;
    public static final Integer RERROR3 = 100002;
    public static final Integer RERROR4 = 100003;
    public static final Integer RERROR5 = 100004;
    public static final Integer RERROR6 = 100005;
    //请求方式
    public static final String GET="GET";
    public static final String POST="POST";

    //需要用到秘钥  AES
    public static final String TOKENKEY="rIx0kOItRGXwfKJksWVhmg==";
    public static final String PASSKEY="xQyfQmWAlLQCT9Y5Gxh2IQ==";

    //token对应的redis的key
    public static final String TOKENHASH="usertokens";
    public static final String TOKECOOKIE="usertoken";
    public static final String TOKENPRE="token:";
}

