package com.xc.springboottemplate.repository;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.xc.springboottemplate.SpringboottemplateApplicationTests;
import com.xc.springboottemplate.comm.UserTypeEnum;
import com.xc.springboottemplate.domain.entity.User;

public class UserRepositoryTest extends SpringboottemplateApplicationTests{
    
    @Resource UserRepository userRepository;
    
    @Test
    public void test() {
        userRepository.deleteAll();
        userRepository.save(new User(1L, "test1", "test1", "test1", "test1", new Date(),UserTypeEnum.teacher));
        userRepository.save(new User(2L, "test2", "test2", "test2", "test2", new Date(),UserTypeEnum.teacher));
        userRepository.save(new User(3L, "test3", "test3", "test3", "test3", new Date(),UserTypeEnum.student));
        List<User> findAll = userRepository.findAll();
        for (User user : findAll) {
            System.out.println(user.toString());
        }
        User findByUserName = userRepository.findByUserName("test1");
        System.out.println(findByUserName.toString());
        User findByUserNameOrEmail = userRepository.findByUserNameOrEmail("test2", "test2");
        System.out.println(findByUserNameOrEmail.toString());
    }
}
