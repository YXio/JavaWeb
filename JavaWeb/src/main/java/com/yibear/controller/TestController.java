package com.yibear.controller;

import com.yibear.service.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;


@Controller
@RequestMapping("/test")
public class TestController {
public static String prefix = "/static/html";
    @RequestMapping(value = "/login")
    public String index(){
        return prefix + "login";
    }


}
