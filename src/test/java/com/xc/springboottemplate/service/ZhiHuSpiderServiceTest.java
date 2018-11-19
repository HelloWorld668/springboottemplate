package com.xc.springboottemplate.service;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xc.springboottemplate.SpringboottemplateApplicationTests;
import com.xc.springboottemplate.domain.entity.Answer;

/** 
 * @author xiong
 * @date：2018年4月14日 下午3:17:15 
 * @Description:
 */
public class ZhiHuSpiderServiceTest extends SpringboottemplateApplicationTests{
    
    @Autowired ZhiHuSpiderService zhiHuSpiderService;
    
    @Test
    public void testGetOneCollectionUrlSync() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetOneAnswerUrlSync() {
        Answer oneAnswerUrlSync = zhiHuSpiderService.getOneAnswerUrlSync();
    }

    @Test
    public void testGetOneImageUrlSync() {
        fail("Not yet implemented");
    }

}
