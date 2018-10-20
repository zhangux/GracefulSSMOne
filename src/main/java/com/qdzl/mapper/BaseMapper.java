package com.qdzl.mapper;

import java.util.List;
import java.util.Map;

/**
 * Dao公共增删改查接口
 * 
 * @author zhangxu
 */
public interface BaseMapper<T> {
    int save(T t);

    int delete(Long id);

    int update(T t);

    T get(Long id);

    List<T> query(Map<String, Object> params);
    
    int queryCount(Map<String, Object> params);
}
