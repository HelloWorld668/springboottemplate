package com.xc.springboottemplate.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.xc.springboottemplate.comm.ZhiHuEnum.TaskStatusEnum;
import com.xc.springboottemplate.domain.BaseEntityWithoutId;

@Entity
@Table(indexes = { // 定义数据库索引。
        // 唯一索引。
        @Index(name = "Answer_taskStatus", columnList = "taskStatus", unique = false)//
})
public class Answer extends BaseEntityWithoutId{
    
    @Column(nullable = false, unique = true)
    @Id
    private String answerId;
    
    @Column(nullable = false)
    private String questionId;
    
    private String userId;
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TaskStatusEnum taskStatus;
    
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAnswerId() {
        return answerId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

}
