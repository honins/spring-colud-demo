package com.hy.hoxton.demo.service;

import com.netflix.http4.NFHttpClient;
import com.netflix.http4.NFHttpClientFactory;

/**
 * @author Created by hy
 * @date on 2020/7/7 15:07
 */
public class TestService {

    public String test(){
        NFHttpClient defaultClient = NFHttpClientFactory.getDefaultClient();
        return null;
    }

}
