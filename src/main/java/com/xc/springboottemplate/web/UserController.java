package com.xc.springboottemplate.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xc.springboottemplate.domain.vo.UserVo;

@RestController
public class UserController {
    
    
    //@RequestMapping("/getUser")
    @RequestMapping("/getUser")
    public UserVo getUser() {
        UserVo user = new UserVo();
        user.setName("cheiong");
        user.setAge(24);
        user.setPass("pass");
        return user;
    }
    @RequestMapping(name="/saveuser")
    public void saveUser(@Valid UserVo user,BindingResult result) {
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getCode()+"-"+error.getDefaultMessage());
            }
        }
    }
}
