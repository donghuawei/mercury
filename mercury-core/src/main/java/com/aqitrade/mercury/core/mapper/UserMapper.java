package com.aqitrade.mercury.core.mapper;

import com.aqitrade.mercury.core.model.User;

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
