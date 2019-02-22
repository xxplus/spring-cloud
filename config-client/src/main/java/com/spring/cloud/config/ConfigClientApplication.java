package com.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigServer
@SpringBootConfiguration
@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

//    @Value("${foo}")
//    private String foo;
//
//    @RequestMapping(value = "/hi")
//    public String hi(){
//        return foo;
//    }
}
