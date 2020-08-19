package com.wolwo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Created by hy
 * @date on 2020/8/19 13:27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacoscGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacoscGateWayApplication.class, args);
    }

}
