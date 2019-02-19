package com.spring.cloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client-01/hi?name=" + name, String.class);
    }

}
