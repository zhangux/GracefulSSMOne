package com.qdzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.qdzl.entity.Goods;
import com.qdzl.service.GoodsService;
import com.qdzl.core.common.Result;
import com.qdzl.core.exception.BizException;

@Service
public class GoodsServiceImpl extends BaseServiceImpl implements GoodsService {

    @Override
    public Result save(Goods t) {
        try {
            if (goodsMapper.save(t) > 0) {
                return Result.suc();
            }
        } catch (BizException e) {
            e.printStackTrace();
        }
        return Result.fail();
    }

    @Override
    public Result delete(Long id) {
        return null;
    }

    @Override
    public Result update(Goods t) {
        return null;
    }

    @Override
    public Result get(Long id) {
        Goods goods = goodsMapper.get(id);
        Result result = Result.ok();
        result.data.put("goods", goods);
        return result;
    }

    @Override
    public Result query(Map<String, Object> params) {
        List<Goods> goodList = goodsMapper.query(params);
        int count = goodsMapper.queryCount(params);
        Result result = Result.ok();
        result.data.put("goodList", goodList.toArray());
        result.count = count;
        return result;
    }
}
