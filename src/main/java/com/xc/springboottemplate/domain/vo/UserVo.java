package com.xc.springboottemplate.domain.vo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserVo {
    public UserVo() {
        super();
    }
    @NotEmpty(message="姓名不能为空")
    private String name;
    @Max(value=100,message="不能大于200")
    @Min(value=18,message="不能小于18")
    private int age;
    @NotEmpty(message="密码不能为空")
    @Length(min=6,message="密码不能小于6位")
    private String pass;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
