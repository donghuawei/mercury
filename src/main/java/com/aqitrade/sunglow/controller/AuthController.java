package com.aqitrade.sunglow.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @PostMapping("/login")
    @ResponseBody
    public JSONObject login(@RequestParam String username, @RequestParam String password){

        JSONObject result = new JSONObject();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
            result.put("token", subject.getSession().getId());
            result.put("msg", "登录成功");
        } catch (IncorrectCredentialsException e) {
            result.put("msg", "密码错误");
        } catch (LockedAccountException e) {
            result.put("msg", "登录失败，该用户已被冻结");
        } catch (AuthenticationException e) {
            result.put("msg", "该用户不存在");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @GetMapping("/unauthorized")
    @ResponseBody
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public JSONObject unauthorized(){

        JSONObject result = new JSONObject();
        result.put("code", HttpStatus.UNAUTHORIZED);
        result.put("message", "Needs login");

        return result;
    }

    @GetMapping("/forbidden")
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public JSONObject forbidden(){

        JSONObject result = new JSONObject();
        result.put("code", HttpStatus.FORBIDDEN);
        result.put("message", "Needs permission");

        return result;
    }
}
