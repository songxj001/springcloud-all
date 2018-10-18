package com.jk.controller;

import com.jk.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/web")
public class WebController {

    @Autowired
    private WebService webService;
    @RequestMapping("/getUserOrder")
    public String getUserOrder(String userId,String orderId){
        String name = webService.getUserInfo(userId);
        HashMap orderInfo = webService.getOrderInfo(orderId);
        return name + orderInfo.toString();
    }
}
