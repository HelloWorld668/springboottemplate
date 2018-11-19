package com.xc.springboottemplate.service;

import com.xc.springboottemplate.domain.entity.Answer;
import com.xc.springboottemplate.domain.entity.Favorites;
import com.xc.springboottemplate.domain.entity.AnswerImage;

public interface ZhiHuSpiderService {
    
    Favorites getOneCollectionUrlSync();

    Answer getOneAnswerUrlSync();

    AnswerImage getOneImageUrlSync();
}
