package com.example.springbootdemo02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@ResponseBody//类返回数据写给浏览器（如是对象转换成json数据），不进行页面的跳转
@Controller//这两个注解类似于RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";

    }
}
