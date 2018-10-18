package com.jk.service;

import com.jk.domain.UserBean;
import com.jk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public HashMap getUserListPage(Integer page, Integer rows) {
        HashMap<String, Object> result = new HashMap<>();
        long count = userRepository.count();
        PageRequest pageRequest = new PageRequest(page-1, rows);
        Page<UserBean> userBeans = userRepository.findAll(pageRequest);
        List<UserBean> content = userBeans.getContent();
        result.put("total",count);
        result.put("rows",content);
        String name = "%张%";
        List<UserBean> li = userRepository.findByUserNameLike(name);
        System.out.println(li);
        return result;
    }
}
