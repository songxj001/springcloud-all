package com.jk.data;

import java.util.HashMap;

public class UserData {
    private static HashMap<String,String> userMap  = new HashMap<>();
    static {
        userMap.put("111","张三");
        userMap.put("222","李四");
    }

    public static String getUserInfo(String userId){
        return userMap.get(userId);
    }
}
