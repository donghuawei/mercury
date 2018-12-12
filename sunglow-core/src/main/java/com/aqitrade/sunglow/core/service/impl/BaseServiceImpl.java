package com.aqitrade.sunglow.core.service.impl;

import com.aqitrade.sunglow.core.service.BaseService;
import com.aqitrade.sunglow.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl<M extends BaseMapper<T>, T> implements BaseService<T> {

    @Autowired
    protected M mapper;

    @Override
    public T get(Serializable id){
        return mapper.selectById(id);
    }

    @Override
    public List<T> list(){
        return mapper.selectList(null);
    }

    @Override
    public int save(T model){
        return mapper.insert(model);
    }

    @Override
    public int update(T model) {
        return mapper.update(model, null);
    }

}
