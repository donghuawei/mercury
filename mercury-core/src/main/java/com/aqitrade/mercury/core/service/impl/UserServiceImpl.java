package com.aqitrade.mercury.core.service.impl;

import com.aqitrade.mercury.core.service.UserService;
import com.aqitrade.mercury.core.model.User;
import com.aqitrade.mercury.core.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Huawei
 * @since 2018-11-30
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

    public User getUserByUsername(String username){
        return mapper.getByUsername(username);
    }
}
