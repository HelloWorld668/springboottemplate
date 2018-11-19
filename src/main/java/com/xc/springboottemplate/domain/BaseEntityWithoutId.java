package com.xc.springboottemplate.domain;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.google.gson.Gson;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntityWithoutId {
    
    private static Gson gson = new Gson();
    
    @CreatedDate
    private Date createDate;
    
    @LastModifiedDate
    private Date updateDate;
    
    public Date getCreateDate() {
        return createDate;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
