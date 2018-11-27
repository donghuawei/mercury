package com.aqitrade.sunglow.service.impl;

import com.aqitrade.sunglow.mapper.BaseMapper;
import com.aqitrade.sunglow.service.BaseService;
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
