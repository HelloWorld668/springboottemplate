package com.xc.springboottemplate.repository.mapper;

import java.util.List;

import com.xc.springboottemplate.domain.entity.User;

public interface UserMapper {
    List<User> getAll();

    List<User> getList(User userParam);

    int getCount(User userParam);

    User getOne(Long id);

    void insert(User user);

    int update(User user);

    int delete(Long id);
}
