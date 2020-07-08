package com.hy.hoxton.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Created by hy
 * @date on 2020/7/7 15:07
 */
@FeignClient(value = "EUREKA-CLIENT", fallback = HiServiceHystrixErrorImpl.class)
public interface HiService {

    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
