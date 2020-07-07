package com.hy.hoxton.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.WebApplicationType.SERVLET;

/**
 * @author Created by hy
 * @date on 2020/7/7 11:47
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class Client1Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Client1Application.class).web(SERVLET).run(args);
    }

}
