package com.qdzl.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qdzl.controller.sys.BaseController;
import com.qdzl.entity.Goods;
import com.qdzl.core.common.Result;

@Controller
@RequestMapping("goods")
public class GoodsController extends BaseController {

    @RequestMapping(value = "query")
    @ResponseBody
    public Result query(@RequestParam Map<String, Object> params) {
        return goodsService.query(getParams(params, true));
    }

    @RequestMapping(value = "")
    @ResponseBody
    public Result query2(@RequestParam Map<String, Object> params) {
        return query(params);
    }

    @RequestMapping("save")
    @ResponseBody
    public Result save(Goods goods) {
        return goodsService.save(goods);
    }

    @RequestMapping("query/{id}")
    @ResponseBody
    public Result get(@PathVariable("id") Long id) {
        return goodsService.get(id);
    }
}
