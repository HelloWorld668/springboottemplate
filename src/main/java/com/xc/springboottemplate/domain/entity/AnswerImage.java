package com.xc.springboottemplate.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.xc.springboottemplate.comm.ZhiHuEnum.TaskStatusEnum;
import com.xc.springboottemplate.domain.BaseEntityWithoutId;

@Entity
public class AnswerImage extends BaseEntityWithoutId{
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TaskStatusEnum taskStatus;
    
    @Column(nullable = false, unique = true)
    @Id
    private String imageUrl;
    
    @Column(nullable = false)
    private String answerId;
    
    @Column(nullable = false)
    private String questionId;

    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
