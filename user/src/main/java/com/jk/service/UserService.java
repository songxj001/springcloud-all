package com.jk.service;

import com.jk.hystric.UserServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@FeignClient(value = "order-server",fallback = UserServiceHystric.class)
public interface UserService {

    @RequestMapping(value = "/api-order/getOrderInfoByOrderId",method = RequestMethod.GET)
    HashMap getUserOrder(@RequestParam("orderId") String orderId);
}
