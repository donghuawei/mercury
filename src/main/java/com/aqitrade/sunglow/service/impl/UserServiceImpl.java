package com.aqitrade.sunglow.service.impl;

import com.aqitrade.sunglow.model.User;
import com.aqitrade.sunglow.mapper.UserMapper;
import com.aqitrade.sunglow.service.UserService;
import com.aqitrade.sunglow.service.impl.BaseServiceImpl;
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
