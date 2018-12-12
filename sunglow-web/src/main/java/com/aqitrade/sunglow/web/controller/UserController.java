package com.aqitrade.sunglow.web.controller;


import com.aqitrade.sunglow.core.model.User;
import com.aqitrade.sunglow.core.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Huawei
 * @since 2018-11-30
 */
@RestController
@RequestMapping("/users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping("")
    @ResponseBody
    public List<User> list(){
        return userService.list();
    }

    @GetMapping("/name/{name}")
    public User getByUsername(@PathVariable String name){
        return userService.getUserByUsername(name);
    }

}

