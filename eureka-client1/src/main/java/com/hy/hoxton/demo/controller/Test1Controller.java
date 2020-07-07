package com.hy.hoxton.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Created by hy
 * @date on 2020/7/7 15:06
 */
@RestController
public class Test1Controller {

    @GetMapping("/hi")
    public String test(@RequestParam String name) {
        return "hi"+name+", i am client1";
    }

}
