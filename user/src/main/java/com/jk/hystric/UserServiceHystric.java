package com.jk.hystric;

import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
@Component
public class UserServiceHystric implements UserService {
    @Override
    public HashMap getUserOrder(String orderId) {
        return new HashMap();
    }
}
