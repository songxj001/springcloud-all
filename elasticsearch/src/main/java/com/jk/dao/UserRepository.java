package com.jk.dao;

import com.jk.model.UserBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends ElasticsearchRepository<UserBean,Integer> {


}
