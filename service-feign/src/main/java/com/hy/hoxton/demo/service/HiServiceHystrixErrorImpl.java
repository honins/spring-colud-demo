package com.hy.hoxton.demo.service;

import org.springframework.stereotype.Component;

/**
 * @author Created by hy
 * @date on 2020/7/8 12:58
 */
//@Component
public class HiServiceHystrixErrorImpl implements HiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name + ",in error by feign";
    }

}
