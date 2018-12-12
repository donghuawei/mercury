package com.aqitrade.sunglow.core.service;

import com.aqitrade.sunglow.core.model.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Huawei
 * @since 2018-11-30
 */
public interface UserService extends BaseService<User> {

    User getUserByUsername(String username);
}
