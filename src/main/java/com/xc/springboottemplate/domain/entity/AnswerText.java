package com.xc.springboottemplate.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.xc.springboottemplate.domain.BaseEntityWithId;

@Entity
public class AnswerText extends BaseEntityWithId{
    
    @Column(nullable = false, unique = true)
    private String answerId;
    
    @Column(nullable = false)
    private String questionId;
    
    private String context;
    
    public String getAnswerId() {
        return answerId;
    }
    public String getQuestionId() {
        return questionId;
    }
    public String getContext() {
        return context;
    }
    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
    public void setContext(String context) {
        this.context = context;
    }
    
}
