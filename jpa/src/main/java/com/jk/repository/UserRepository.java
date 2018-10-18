package com.jk.repository;

import com.jk.domain.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<UserBean,Long> {

    List<UserBean> findByUserNameLike(String name);
}
