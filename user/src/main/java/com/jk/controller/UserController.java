package com.jk.controller;

import com.jk.data.UserData;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api-user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserOrder")
    public HashMap getUserOrder(String orderId){
       return userService.getUserOrder(orderId);
    }

    @GetMapping("/getUserInfo")
    public String getUserInfo(String userId){
        System.out.println(UserData.getUserInfo(userId));
        return UserData.getUserInfo(userId);
    }
}
