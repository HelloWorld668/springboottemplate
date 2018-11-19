package com.xc.springboottemplate.repository;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xc.springboottemplate.domain.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, String>{
    
    @Lock(value = LockModeType.PESSIMISTIC_WRITE)
    @Query(value = "select a from Answer a where a.answerId = :answerId ")  
    public Answer getAnswerForUpdate(@Param("answerId") String answerId);  
    
    @Query(value = "select a.answerId from Answer a where a.taskStatus = init order by createDate asc limit 1")  
    public String getMaxId();  
    
}
