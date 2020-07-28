package com.hy.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by hy
 * @date on 2020/7/28 13:56
 */
@RestController
@RefreshScope
public class NacosConfigController {

    @Value("${spring.profiles.active}")
    public String active;

    @Value("${current.env}")
    public String currentEnvironment;

    @Value("${user.name}")
    public String name;

    @Value("${user.age}")
    public Integer age;

    @GetMapping("/config/info")
    public String getConfig() {
        return "currentEnvironment:" + currentEnvironment + " active: " + active + " name：" + name + " age：" + age;
    }

}
