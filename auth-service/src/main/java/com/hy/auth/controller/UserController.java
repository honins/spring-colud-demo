package com.hy.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Created by hy
 * @date on 2020/8/19 16:50
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    public UserDetailsService userMapper;


    @GetMapping("getByName")
    public UserDetails getByName(){
        return userMapper.loadUserByUsername("");
    }

    /**
     * 获取授权的用户信息
     * @param principal 当前用户
     * @return 授权信息
     */
    @GetMapping("current/get")
    public Principal user(Principal principal){
        return principal;
    }
}
