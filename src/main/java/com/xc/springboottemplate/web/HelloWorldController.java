package com.xc.springboottemplate.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xc.springboottemplate.comm.CommonProperties;

/*
 * @RestController  Controller里面的方法都以json格式输出
 * @Controller 输出为页面的内容
 */
@RestController
public class HelloWorldController {
    
    @Resource
    CommonProperties commonProperties;
    
    /*
     * 方法参数即为请求带的参数
     */
    @GetMapping("/hello")
    public String  hello(String name) {
        return "hello "+name+" , I am "+commonProperties.getAppname();
    }
}
