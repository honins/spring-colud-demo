package com.hy.hoxton.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

import static org.springframework.boot.WebApplicationType.SERVLET;

/**
 * @author Created by hy
 * @date on 2020/7/7 11:47
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class FeignApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignApplication.class).web(SERVLET).run(args);
    }

}
