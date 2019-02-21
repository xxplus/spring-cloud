package com.spring.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

   // @HystrixCommand 注解对该方法创建了熔断器的功能

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String name){
        return restTemplate.getForObject("http://eureka-client-01/hi?name=" + name, String.class);
    }

    public String hiError(String name){
        return "hi," + name + ", sorry, error!";
    }

}
