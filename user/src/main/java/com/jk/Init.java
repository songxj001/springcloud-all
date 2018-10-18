package com.jk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 项目启动时初始化一些数据
 */
@Component
@Order(1)//按照顺序启动 第一个
public class Init implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("初始化内存缓存");
    }
}
