package com.sportplatform.sportplay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    //命令所有方法返回一个字符串
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }


}
