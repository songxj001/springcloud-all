package com.jk.data;

import java.util.HashMap;

public class OrderData {
    private static HashMap<String,HashMap> orderMap = new HashMap<>();
    static {
        HashMap<String, Object> order123 = new HashMap<>();
        order123.put("price",9999.99);
        order123.put("goods","iphoneX");
        orderMap.put("123",order123);
    }

    public static HashMap<String, Object> getOrderInfo(String orderId){
        return orderMap.get(orderId) == null ? new HashMap<>() : orderMap.get(orderId);
    }
}
