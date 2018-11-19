package com.xc.springboottemplate.service;

import java.util.List;

import com.xc.springboottemplate.domain.AnswerContext;
import com.xc.springboottemplate.domain.entity.Answer;
import com.xc.springboottemplate.domain.entity.Favorites;

public interface ZhiHuParserService {
    
    List<Answer> getAnswerUrlFromCollectionUrl(Favorites collectionUrl);

    AnswerContext getAnswerContextFromAnswerUrl(Answer answerUrl);
}
