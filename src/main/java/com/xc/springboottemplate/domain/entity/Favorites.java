package com.xc.springboottemplate.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Index;
import javax.persistence.Table;

import com.xc.springboottemplate.comm.ZhiHuEnum.TaskStatusEnum;
import com.xc.springboottemplate.domain.BaseEntityWithId;

@Entity
@Table(indexes = { // 定义数据库索引。
        // 唯一索引。
        @Index(name = "Collection_collcetionId_pageNo", columnList = "collcetionId,pageNo", unique = true)//
})
public class Favorites extends BaseEntityWithId {
    
    @Column(nullable = false)
    private String collcetionId;

    @Column(nullable = false)
    private Integer pageNo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TaskStatusEnum taskStatus;

    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getCollcetionId() {
        return collcetionId;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setCollcetionId(String collcetionId) {
        this.collcetionId = collcetionId;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
}
