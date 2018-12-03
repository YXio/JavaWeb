package com.yibear.controller.Api;


import com.yibear.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping("/api")
public class LoginApi {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Map<String,Object> root){
        User user = new User();
        user.setId(0);
        user.setNickName("hey");
        user.setPassword("1");
        user.setUserType(0);
        user.setUserName("dick");
        root.put("user",user);
        System.out.println("login");
        return "login";
    }
}
