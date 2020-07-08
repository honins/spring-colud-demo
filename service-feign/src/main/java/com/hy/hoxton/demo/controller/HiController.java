package com.hy.hoxton.demo.controller;

import com.hy.hoxton.demo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by hy
 * @date on 2020/7/7 17:22
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return hiService.sayHiFromClientOne(name);
    }

}
