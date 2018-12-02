package com.babystore.common.token;

import com.alibaba.fastjson.JSON;
import com.babystore.common.constant.Constants;
import com.babystore.common.utils.EncrypUtil;

import java.util.Random;

import static java.lang.System.currentTimeMillis;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-29 14:08
 **/

public class TokenUtil {
    public static String createToken(String content,Integer id) {
        Token token = new Token(content, currentTimeMillis(), id, new Random().nextLong());
        String json = JSON.toJSONString(token);
        return EncrypUtil.encAesStr(Constants.TOKENKEY,json);
    }
    //解析令牌
    public static Token parseToken(String token){
        String json=EncrypUtil.decAesStr(Constants.TOKENKEY,token);
        return JSON.parseObject(json,Token.class);
    }
    //更新令牌
    public static String updateToken(Token token){
        token.setTime(System.currentTimeMillis());
        return EncrypUtil.encAesStr(Constants.TOKENKEY,JSON.toJSONString(token));
    }

}

