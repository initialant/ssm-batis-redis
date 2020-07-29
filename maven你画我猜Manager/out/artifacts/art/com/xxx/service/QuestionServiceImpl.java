package com.xxx.service;

import com.xxx.dao.QuestionMapper;
import com.xxx.pojo.Answer;
import com.xxx.pojo.Question;
import com.xxx.pojo.SearchCriteria;
import com.xxx.pojo.Sponsor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("questionService")
public class QuestionServiceImpl implements  QuestionService{

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<Question> queryQuestion() {
        return questionMapper.queryQuestion();
    }

    @Override
    public void insertAsk(Question question) {
        questionMapper.insertAsk(question);
    }

    @Override
    public int getNumByType(int type) {
        return questionMapper.getNumByType(type);
    }

    @Override
    public List<Question> queryQuestionByType(int type) {
        return questionMapper.queryQuestionByType(type);
    }

    @Override
    public List<Question> queryByTime(SearchCriteria searchCriteria) {
        return questionMapper.queryByTime(searchCriteria);
    }

    @Override
    public List<Question> queryAnswerZero(SearchCriteria searchCriteria) {
        return questionMapper.queryAnswerZero(searchCriteria);
    }

    @Override
    public List<Question> queryByScanCnt(SearchCriteria searchCriteria) {
        return questionMapper.queryByScanCnt(searchCriteria);
    }

    @Override
    public Question queryById(int id) {
        return questionMapper.queryById(id);
    }

    @Override
    public List<Answer> getAnswerById(SearchCriteria idOfQuestion) {
        return questionMapper.getAnswerById(idOfQuestion);
    }

    @Override
    public List<Answer> getAnswerByTime(SearchCriteria id) {
        return questionMapper.getAnswerByTime(id);
    }

    @Override
    public void insertAnswer(Answer answer) {
        questionMapper.insertAnswer(answer);
    }

    @Override
    public int getNumByType1(int type) {
        return questionMapper.getNumByType1(type);
    }

    @Override
    public int getNumByType2(int typeKind) {
        return questionMapper.getNumByType2(typeKind);
    }

    @Override
    public int getNumByProblemId(int id) {
        return questionMapper.getNumByProblemId(id);
    }

    @Override
    public int addTheScanCount(int id) {
        return questionMapper.addTheScanCount(id);
    }

    @Override
    public int addTheAnsCount(int id) {
        return questionMapper.addTheAnsCount(id);
    }

    @Override
    public Sponsor sponsorCheck(Sponsor sponsor) {
        return questionMapper.sponsorCheck(sponsor);
    }


    @Override
    public int decTheSponserOfQuestion(int id) {
        return questionMapper.decTheSponserOfQuestion(id);
    }

    @Override
    public int addTheSponserOfQuestion(int id) {
        return questionMapper.addTheSponserOfQuestion(id);
    }

    @Override
    public int insertSponsor(Sponsor sponsor) {
        return questionMapper.insertSponsor(sponsor);
    }

    @Override
    public int decTheAnsCount(int id) {
        return questionMapper.decTheAnsCount(id);
    }

    @Override
    public int addTheSponserOfAns(int id) {
        return questionMapper.addTheSponserOfAns(id);
    }

    @Override
    public int decTheSponserOfAns(int id) {
        return questionMapper.decTheSponserOfAns(id);
    }


}
