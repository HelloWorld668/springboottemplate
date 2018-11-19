package com.xc.springboottemplate.service.impl;

import java.util.List;

import com.xc.springboottemplate.comm.ZhiHuUitls;
import com.xc.springboottemplate.domain.AnswerContext;
import com.xc.springboottemplate.domain.entity.Answer;
import com.xc.springboottemplate.domain.entity.Favorites;
import com.xc.springboottemplate.service.ZhiHuParserService;

public class ZhiHuParserServiceImpl implements ZhiHuParserService{

    @Override
    public List<Answer> getAnswerUrlFromCollectionUrl(Favorites favorites) {
        String url = ZhiHuUitls.getCollectionUrlFromFavorites(favorites);
        
        return null;
    }

    @Override
    public AnswerContext getAnswerContextFromAnswerUrl(Answer answerUrl) {
        // TODO Auto-generated method stub
        return null;
    }
    

}
