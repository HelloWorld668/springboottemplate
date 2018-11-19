package com.xc.springboottemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xc.springboottemplate.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUserName(String userName);
    User findByUserNameOrEmail(String userName,String email);
}
