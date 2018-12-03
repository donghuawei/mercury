package com.aqitrade.sunglow.mapper;

import com.aqitrade.sunglow.model.User;
import com.aqitrade.sunglow.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Huawei
 * @since 2018-11-30
 */
public interface UserMapper extends BaseMapper<User> {

    User getByUsername(String username);

}
