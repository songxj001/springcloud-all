package com.jk.service;

import com.jk.hystrix.WebServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@FeignClient(value = "zuul-server",fallback = WebServiceHystrix.class)
public interface WebService {

    @RequestMapping(value = "/api-user/getUserInfo",method = RequestMethod.GET)
    String getUserInfo(@RequestParam("userId") String userId);

    @RequestMapping(value = "/api-order/getOrderInfoByOrderId",method = RequestMethod.GET)
    HashMap getOrderInfo(@RequestParam("orderId") String orderId);
}
