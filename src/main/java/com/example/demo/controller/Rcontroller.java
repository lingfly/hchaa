package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*********************************
 * <p> 功能说明: 
 * <p> 开发人员：zhengzhongwei0@gmail.com
 * <p> 开发时间: 
 **********************************/
@RestController
@RequestMapping(path = "/hhh",name = "asf")
public class Rcontroller {
    @GetMapping("/")
    public String hc () {
        return "123123";
    }
}
