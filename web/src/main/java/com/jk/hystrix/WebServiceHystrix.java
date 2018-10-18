package com.jk.hystrix;

import com.jk.service.WebService;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class WebServiceHystrix implements WebService {

    @Override
    public String getUserInfo(String userId) {
        return null;
    }

    @Override
    public HashMap getOrderInfo(String orderId) {
        return null;
    }
}
