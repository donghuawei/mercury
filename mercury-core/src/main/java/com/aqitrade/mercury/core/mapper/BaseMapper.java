package com.aqitrade.mercury.core.mapper;

import com.aqitrade.mercury.core.mapper.common.BaseSqlProvider;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface BaseMapper<T> extends com.baomidou.mybatisplus.core.mapper.BaseMapper<T> {

    @Deprecated
    @SelectProvider(type = BaseSqlProvider.class, method = "list")
    List<T> listUsingSqlProvider(Class klass);

}
