package com.spring.cloud.feign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystric implements HelloService{

    @Override
    public String sayHi(String name) {
        return "hi, error!!!";
    }
}
