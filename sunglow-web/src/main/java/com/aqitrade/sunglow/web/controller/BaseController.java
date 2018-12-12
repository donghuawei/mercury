package com.aqitrade.sunglow.web.controller;

import com.aqitrade.sunglow.core.service.BaseService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class BaseController<S extends BaseService<T>, T> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    S service;

    @GetMapping("")
    public List<T> list(){
        return service.list();
    }

    @ApiOperation(
            nickname = "Get ${T}",
            value = "get ${T}",
            notes = "get ${T}",
            httpMethod = "GET")
    @GetMapping("/{id}")
    public T getById(@PathVariable Integer id){
        return service.get(id);
    }


}
