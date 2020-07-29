package com.xxx.service;

import com.xxx.pojo.Answer;
import com.xxx.pojo.Question;
import com.xxx.pojo.SearchCriteria;
import com.xxx.pojo.Sponsor;

import java.util.List;

public interface QuestionService {
    List<Question> queryQuestion();
   // void addAsk(Question question);
   void insertAsk(Question question);

   //根据总类拿到条数,信息
   int getNumByType(int type);
   List<Question> queryQuestionByType(int type);

    List<Question> queryByTime(SearchCriteria searchCriteria);

    List<Question> queryAnswerZero(SearchCriteria searchCriteria);

    List<Question> queryByScanCnt(SearchCriteria searchCriteria);

    Question queryById(int id);

    List<Answer> getAnswerById(SearchCriteria idOfQuestion);

    List<Answer> getAnswerByTime(SearchCriteria id);

    void insertAnswer(Answer answer1);

    int getNumByType1(int typeKind);

    int getNumByType2(int typeKind);

    int getNumByProblemId(int id);

    int addTheScanCount(int id);

    int addTheAnsCount(int id);

    Sponsor sponsorCheck(Sponsor sponsor);

    int decTheSponserOfQuestion(int id);

    int addTheSponserOfQuestion(int id);

    int insertSponsor(Sponsor sponsor);

    int decTheAnsCount(int idOf);

    int addTheSponserOfAns(int id);

    int decTheSponserOfAns(int id);
}
