package com.qdzl.controller.sys;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.qdzl.service.GoodsService;

/**
 * Controller参数处理
 * 
 * @author zhangxu
 */
@Controller
public class BaseController {

    @Resource
    protected GoodsService goodsService;

    protected Map<String, Object> getParams(Map<String, Object> params) {
        if (params.get("page") != null && !params.get("page").equals("") && params.get("rows") != null
                && !params.get("rows").equals("")) {
            Integer page = Integer.parseInt(params.get("page").toString());
            Integer rows = Integer.parseInt(params.get("rows").toString());
            params.put("page", (page - 1) * rows);
            params.put("rows", rows);
        }
        return params;
    }

    protected Map<String, Object> getParams(Map<String, Object> params, boolean isPage) {
        if (params.get("page") != null && !params.get("page").equals("") && params.get("rows") != null
                && !params.get("rows").equals("")) {
            Integer page = Integer.parseInt(params.get("page").toString());
            Integer rows = Integer.parseInt(params.get("rows").toString());
            params.put("page", (page - 1) * rows);
            params.put("rows", rows);
        } else if (isPage) {
            params.put("page", 0);
            params.put("rows", 10);
        }
        return params;
    }
}
