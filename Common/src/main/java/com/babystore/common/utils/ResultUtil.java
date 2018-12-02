package com.babystore.common.utils;

import com.babystore.common.constant.Constants;
import com.babystore.common.vo.ResultBean;
import com.babystore.common.vo.ResultPageBean;

import java.util.List;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-28 20:15
 **/

public class ResultUtil {
    //操作成功
    public static ResultBean setOK(String msg,Object data) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(100000);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }

    //操作失败
    public static ResultBean setERROR(Integer code,String msg,Object data) {
        ResultBean resultBean = new ResultBean();
        resultBean.setCode(code);
        resultBean.setData(data);
        resultBean.setMsg(msg);
        return resultBean;
    }
    //分页操作
    public static ResultPageBean setPageOK(Integer page, Integer limit, Integer count, List<Object> data) {
        ResultPageBean resultPageBean = new ResultPageBean();
        resultPageBean.setCode(100000);
        resultPageBean.setData(data);
        resultPageBean.setMsg("OK");
        resultPageBean.setTotalCount(count);
        resultPageBean.setLimit(limit);
        resultPageBean.setCurrPage(page);
        resultPageBean.setCurrPage(count%limit==0?count/limit:count/limit+1);
        return resultPageBean;
    }

    public static ResultPageBean setPageERROR(Integer code, Integer page, Integer limit, Integer count, List<Object> data) {
        ResultPageBean resultPageBean = new ResultPageBean();
        resultPageBean.setCode(code);
        resultPageBean.setMsg("ERROR");
        return resultPageBean;
    }
    public static ResultBean expUtil(String msg,Integer integer) {
        if (integer>0) {
            return setOK(msg+"成功", null);
        } else {
            return setERROR(Constants.RERROR2, msg+"失败", null);
        }
    }
}
