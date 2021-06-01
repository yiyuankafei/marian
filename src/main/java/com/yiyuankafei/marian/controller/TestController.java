package com.yiyuankafei.marian.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hi")
    public String hi(String name) {
        return String.format("hi,%s~ greeting from marian", name);
    }

}
