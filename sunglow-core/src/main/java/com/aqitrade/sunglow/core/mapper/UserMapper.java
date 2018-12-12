package com.aqitrade.sunglow.core.mapper;

import com.aqitrade.sunglow.core.model.User;

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
