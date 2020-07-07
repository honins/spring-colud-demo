package com.hy.hoxton.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Created by hy
 * @date on 2020/7/7 15:07
 */
@Service
public class HiService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        String client = "EUREKA-CLIENT";
        return restTemplate.getForObject("http://"+client+"/hi?name="+name,String.class);
    }

}
