package com.jk.controller;

import com.jk.dao.UserRepository;
import com.jk.model.UserBean;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * 添加索引
     * @return
     */
    @RequestMapping("add")
    public String add(){
        UserBean userBean = new UserBean();
        userBean.setId(2);
        userBean.setAge(22);
        userBean.setBirthday(new Date());
        userBean.setName("张三2");
        userBean.setPassword("zhangsan2");
        userBean.setSex(0);
        userRepository.save(userBean);
        return "success";
    }

    @RequestMapping("search")
    public Iterable<UserBean> search(String q){
        Iterable<UserBean> all = userRepository.findAll();
        return all;
    }
}
