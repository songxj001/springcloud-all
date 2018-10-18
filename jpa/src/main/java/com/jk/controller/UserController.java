package com.jk.controller;

import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserList")
    public HashMap getUserList(Integer page, Integer rows){
        HashMap result = userService.getUserListPage(page,rows);
        return result;
    }
}
