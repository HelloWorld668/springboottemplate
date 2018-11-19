package com.xc.springboottemplate.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xc.springboottemplate.SpringboottemplateApplicationTests;

/** 
 * @author xiong
 * @date：2018年4月14日 下午4:02:33 
 * @Description:
 */
public class AnswerRepositoryTest extends SpringboottemplateApplicationTests{
    
    @Autowired AnswerRepository answerRepository;
    
    @Test
    public void testGetMaxId() {
        String maxId = answerRepository.getMaxId();
        System.out.println("==========="+maxId);
    }

}
