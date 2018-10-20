package com.qdzl.service.impl;

import javax.annotation.Resource;

import com.qdzl.mapper.GoodsMapper;
import com.qdzl.core.common.Result;

/**
 * Service共用的对象
 * 
 * @author zhangxu
 */
public class BaseServiceImpl {
    @Resource
    protected GoodsMapper goodsMapper;

    protected Result result;
}
