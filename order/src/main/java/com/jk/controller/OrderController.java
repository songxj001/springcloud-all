package com.jk.controller;

import com.jk.data.OrderData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api-order")
@Api(value = "订单接口")
public class OrderController {


    /**
     * 查询订单详细信息通过订单号
     * @param orderId
     * @return
     */
    @GetMapping("/getOrderInfoByOrderId")
    @ApiOperation(value = "查询订单详情",notes = "根据订单号查询订单详情")
    @ApiImplicitParam(name = "orderId",value = "订单号",required = true,paramType = "query",dataType = "string")
    public HashMap<String, Object> getOrderInfoByOrderId(String orderId){
        return OrderData.getOrderInfo(orderId);
    }
}
