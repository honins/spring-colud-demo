package com.hy.hoxton.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.boot.WebApplicationType.SERVLET;

/**
 * @author Created by hy
 * @date on 2020/7/7 11:47
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class RibbonApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbonApplication.class).web(SERVLET).run(args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
