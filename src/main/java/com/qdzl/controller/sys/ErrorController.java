package com.qdzl.controller.sys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qdzl.core.common.Result;

@Controller
@RequestMapping("error")
public class ErrorController {
    @RequestMapping("400")
    @ResponseBody
    public Result error_400(HttpServletRequest request) {
        return Result.fail(Result.STATE_PARAMS_ERROR, "传入参数不合法");
    }

    @RequestMapping("404")
    @ResponseBody
    public Result error_404(HttpServletRequest request) {
        return Result.fail(Result.STATE_SERVER_ERROR_404, "抱歉我没写这个借口");
    }

    @RequestMapping("500")
    @ResponseBody
    public Result error_500(HttpServletRequest request) {
        return Result.fail(Result.STATE_SERVER_ERROR_500, "服务器异常");
    }
}