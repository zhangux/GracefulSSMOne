package com.qdzl.core.common;

import java.util.HashMap;
import java.util.Map;

public class Result {
    public static final int STATE_SUC = 0;//成功
    public static final int STATE_FAIL = 1;//失败
    public static final int STATE_PARAMS_ERROR = 2;//参数不合法
    public static final int STATE_NO_MORE = 3;//其他错误
    
    public static final int STATE_SERVER_ERROR_400 = 400;//服务器 400
    public static final int STATE_SERVER_ERROR_404 = 404;//服务器 404
    public static final int STATE_SERVER_ERROR_500 = 500;//服务器 405

    public Map<String, Object> data;
    public String msg;
    public Integer count;
    public int state;

    public Result() {
        data = new HashMap<>();
        msg = null;
        count = null;
        state = 0;
    }
    
    public static Result suc(int state, String msg) {
        Result r = new Result();
        r.state = state;
        r.msg = msg;
        return r;
    }

    public static Result suc() {
        return suc(STATE_SUC, "操作成功");
    }

    public static Result ok() {
        return suc(STATE_SUC, "查询成功");
    }
    
    public static Result fail(int state, String msg) {
        Result r = new Result();
        r.state = state;
        r.msg = msg;
        return r;
    }

    public static Result fail() {
        return fail(STATE_FAIL, "操作失败");
    }
}
