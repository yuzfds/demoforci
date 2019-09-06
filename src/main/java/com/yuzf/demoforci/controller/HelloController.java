package com.yuzf.demoforci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    String helloCI(){
        return "hello CI/CD";
    }
}
