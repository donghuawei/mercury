package com.aqitrade.sunglow.core.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

    T get(Serializable id);

    List<T> list();

    int save(T model);

    int update(T model);
}
