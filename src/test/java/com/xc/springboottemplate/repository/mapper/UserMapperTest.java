package com.xc.springboottemplate.repository.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xc.springboottemplate.SpringboottemplateApplicationTests;
import com.xc.springboottemplate.domain.entity.User;

public class UserMapperTest extends SpringboottemplateApplicationTests{
 
    @Autowired UserMapper userMapper;
    
    @Test
    public void testGetAll() {
        List<User> all = userMapper.getAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetList() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetCount() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetOne() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsert() {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdate() {
        fail("Not yet implemented");
    }

    @Test
    public void testDelete() {
        fail("Not yet implemented");
    }

}
