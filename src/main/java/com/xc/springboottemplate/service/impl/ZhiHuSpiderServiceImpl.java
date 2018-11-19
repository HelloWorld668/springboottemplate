package com.xc.springboottemplate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.xc.springboottemplate.domain.entity.Answer;
import com.xc.springboottemplate.domain.entity.Favorites;
import com.xc.springboottemplate.domain.entity.AnswerImage;
import com.xc.springboottemplate.repository.AnswerImageRepository;
import com.xc.springboottemplate.repository.AnswerRepository;
import com.xc.springboottemplate.repository.FavoritesRepository;
import com.xc.springboottemplate.service.ZhiHuSpiderService;

@Component
public class ZhiHuSpiderServiceImpl implements ZhiHuSpiderService{
    
    @Autowired FavoritesRepository favoritesRepository;
    
    @Autowired AnswerImageRepository answerImageRepository;
    
    @Autowired AnswerRepository answerRepository;
    
    @Override
    public Favorites getOneCollectionUrlSync() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @Transactional
    public Answer getOneAnswerUrlSync() {
       /* answerRepository.getAnswerForUpdate(answerId);*/
        Answer answerForUpdate = answerRepository.getAnswerForUpdate("2");
        try {
            Thread.sleep(1000*60*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return answerForUpdate;
    }

    @Override
    public AnswerImage getOneImageUrlSync() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
