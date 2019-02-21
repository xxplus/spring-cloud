package com.spring.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-01", fallback = HelloServiceHystric.class)
public interface HelloService {

    @RequestMapping("/hi")
    String sayHi(@RequestParam String name);

}
