package com.hy.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Created by hy
 * @date on 2020/8/20 14:33
 */
@Service
public class ResourceServiceImpl {

    private Map<String, List<String>> resourceRolesMap;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @PostConstruct
    public void initData() {
        resourceRolesMap = new TreeMap<>();
        resourceRolesMap.put("/api/hello", new ArrayList<>());
        resourceRolesMap.put("/api/user/currentUser", new ArrayList<>());
        redisTemplate.opsForHash().putAll("AUTH:RESOURCE_ROLES_MAP", resourceRolesMap);
    }

}
