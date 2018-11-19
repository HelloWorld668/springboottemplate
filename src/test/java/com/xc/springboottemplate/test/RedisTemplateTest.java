package com.xc.springboottemplate.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.xc.springboottemplate.SpringboottemplateApplicationTests;

public class RedisTemplateTest extends SpringboottemplateApplicationTests{
    @Autowired
    RedisTemplate redisTemplate;
    
    @Test
    public void testString()  {
        redisTemplate.opsForValue().set("test", "ityouknow");
        redisTemplate.opsForValue().set("test", "hello");
        Object object = redisTemplate.opsForValue().get("test");
        System.out.println(object);
    }
}
