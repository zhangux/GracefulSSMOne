package com.qdzl.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.qdzl.entity.Goods;
import com.qdzl.mapper.GoodsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class GoodsDaoTest {

    @Resource
    private GoodsMapper goodsMapper;

    @Test
    public void testQuery() {
//        Map<String, Object> params = new HashMap<>();
//        params.put("page", 0);
//        params.put("rows", 10);
//        List<Goods> goodList = goodsMapper.query(params);
//        System.out.println(JSON.toJSONString(goodList));
    }
}
