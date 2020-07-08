package com.hy.hoxton.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "error")
    public String hiService(String name) {
        String client = "EUREKA-CLIENT";
        return restTemplate.getForObject("http://" + client + "/hi?name=" + name, String.class);
    }

    public String error(String name) {
        return "sorry," + name + ",in error by ribbon";
    }
}
