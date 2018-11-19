package com.xc.springboottemplate.comm;

import com.xc.springboottemplate.domain.entity.Answer;
import com.xc.springboottemplate.domain.entity.Favorites;

/** 
 * @author xiong
 * @date：2018年4月14日 下午2:54:53 
 * @Description:
 */
public class ZhiHuUitls {
    
    private static String  collectionPattern= "https://www.zhihu.com/collection/%s?page=%s";
    private static String  answerUrlPattern= "https://www.zhihu.com/question/%s/answer/%s";
    private static String  questionPattern= "https://www.zhihu.com/question/%s";
    
    public static String getCollectionUrlFromFavorites(Favorites favorites){
        return String.format(collectionPattern, favorites.getCollcetionId(),favorites.getPageNo());
    }
    public static String getAnswerUrlFromAnswer(Answer answer){
        return String.format(answerUrlPattern, answer.getQuestionId(),answer.getAnswerId());
    }
    public static String getQuestionUrlFromAnswer(Answer answer){
        return String.format(questionPattern, answer.getQuestionId());
    }
}
