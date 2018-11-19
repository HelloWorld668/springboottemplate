package com.xc.springboottemplate.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;

import com.xc.springboottemplate.comm.UserTypeEnum;
import com.xc.springboottemplate.domain.BaseEntityWithId;

@Entity
public class User extends BaseEntityWithId{

    /*
     * unique = true 会在db生成索引
     */
    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String passWord;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = true, unique = true)
    private String nickName;

    @Column(nullable = false)
    private Date regTime;
    
    /*
     * 会在db生成索引
     */
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserTypeEnum userType;
    
    public UserTypeEnum getUserType() {
        return userType;
    }
    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    /*
     * @Transient 不映射到数据库
     */
    @Transient
    private String marks;
    
    public User() {
    }
    public User(Long id, String userName, String passWord, String email, String nickName, Date regTime,UserTypeEnum userTypeEnum) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.nickName = nickName;
        this.regTime = regTime;
        this.userType = userTypeEnum;
    }


    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmail() {
        return email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    
}
