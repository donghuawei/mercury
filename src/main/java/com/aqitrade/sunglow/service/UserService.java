package com.aqitrade.sunglow.service;

import com.aqitrade.sunglow.model.User;
import com.aqitrade.sunglow.service.BaseService;

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
