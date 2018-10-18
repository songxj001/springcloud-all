package com.jk;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//开启Feign的功能
@EnableFeignClients
//开启断路器
@EnableHystrix
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(UserApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.addInitializers();
        app.run(args);
        //SpringApplication.run(UserApplication.class, args);
    }
}
