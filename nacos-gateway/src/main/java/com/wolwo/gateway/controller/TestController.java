package com.wolwo.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by hy
 * @date on 2020/8/19 15:02
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

//    @GetMapping("/provider/{str}")
    public String provider(@PathVariable String str){
        return "provider"+str;
    }

}
