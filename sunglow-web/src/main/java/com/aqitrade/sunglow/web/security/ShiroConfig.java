package com.aqitrade.sunglow.web.security;


import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

//    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
//        //以下是过滤链，按顺序过滤，所以/**需要放最后
//        //开放的静态资源
//        filterChainDefinitionMap.put("/favicon.ico", "anon");//网站图标
//        filterChainDefinitionMap.put("/**", "authc");
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//        return shiroFilterFactoryBean;
//    }


    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();

//        // logged in users with the 'admin' role
//        chainDefinition.addPathDefinition("/admin/**", "authc, roles[admin]");
//        // logged in users with the 'document:read' permission
//        chainDefinition.addPathDefinition("/**", "authc, perms[document:read]");
//        // all other paths require a logged in user
//        chainDefinition.addPathDefinition("/**", "authc");


        //放行swagger
        chainDefinition.addPathDefinition("/swagger-ui.html","anon");
        chainDefinition.addPathDefinition("/swagger/**","anon");
        chainDefinition.addPathDefinition("/webjars/**", "anon");
        chainDefinition.addPathDefinition("/swagger-resources/**","anon");
        chainDefinition.addPathDefinition("/v2/**","anon");

        //放行 druid
        chainDefinition.addPathDefinition("/druid/**","anon");

        chainDefinition.addPathDefinition("/auth/**", "anon");
        chainDefinition.addPathDefinition("/users/**", "authc");
        chainDefinition.addPathDefinition("/**", "authc");
        return chainDefinition;
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager(myRealm());
        return defaultWebSecurityManager;
    }

    @Bean
    public AuthRealm myRealm() {
        AuthRealm realm = new AuthRealm();
        return realm;
    }


    //加入注解的使用，不加入这个注解不生效
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }


    @ExceptionHandler(UnauthenticatedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Map<String, Object> handleException(AuthorizationException e){

        // you could return a 404 here instead (this is how github handles 403, so the user does NOT know there is a
        // resource at that location)
//        log.debug("AuthorizationException was thrown", e);

        Map<String, Object> map = new HashMap<>();
        map.put("status", HttpStatus.UNAUTHORIZED.value());
        map.put("message", "No message available");

        return map;
    }
}

