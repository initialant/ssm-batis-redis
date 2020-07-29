package com.xxx.controller;

import com.xxx.pojo.*;
import com.xxx.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ques")
public class QuestionController {

    @Autowired
    private QuestionService questionService;


    @RequestMapping("/initQuestion")
    @ResponseBody
    public List<Question> initQuestion() {
        return questionService.queryQuestion();
    }

    @RequestMapping("/submitAsk")
    @ResponseBody
    public Question addAsk(String title,String type,String author,String description,String label1,String label2,String label3) {
        Question question = new Question();
        question.setTitle(title);
        question.setAuthor(Integer.parseInt(author));
        question.setDescAboutTitle(description);
        question.setType(Integer.parseInt(type));
        question.setFirstLabel(Integer.parseInt(label1));
        question.setSecondLabel(Integer.parseInt(label2));
        question.setThirdLabel(Integer.parseInt(label3));

        questionService.insertAsk(question);
        return question;
    }

    @RequestMapping("/getCountOfQuestionByType")
    @ResponseBody
    public PageSolve getCountOfQuestionByType( String type, String criteria) {
        int typeKind = Integer.parseInt(type);
        int criteriaKind = Integer.parseInt(criteria);
            int count = 0;
        if(criteriaKind == 1){
            count = questionService.getNumByType(typeKind);
        }else if(criteriaKind == 4){
            count = questionService.getNumByType1(typeKind);
        }else{
            count = questionService.getNumByType2(typeKind);
        }

        PageSolve pageSolve = new PageSolve();
        pageSolve.setCount(count);
        pageSolve.setPageCount(3);
        return pageSolve;
    }

    @RequestMapping("/getQuestionByType")
    @ResponseBody
    public List<Question> getQuestionByType(String type) {
        int typeKind = Integer.parseInt(type);
        return questionService.queryQuestionByType(typeKind);
    }

    @RequestMapping("/getSpecificQuestion")
    @ResponseBody
    public List<Question> getSpecificQuestion(String type,String page,String limit,String sortKind) {
        int typeKind = Integer.parseInt(type);
        int pageNum = Integer.parseInt(page);
        int limitNum = Integer.parseInt(limit);
        int sortKindNum = Integer.parseInt(sortKind);
        //计算出limit的条件
        SearchCriteria searchCriteria = new SearchCriteria();
        searchCriteria.setType(typeKind);
        searchCriteria.setTheBegin((pageNum) * limitNum);
        searchCriteria.setTheOver(limitNum);
        searchCriteria.setTheCriteria(sortKindNum);

         if(sortKindNum == 1){
        //default time
            List<Question> questions = questionService.queryByTime(searchCriteria);
             return questions;
        } else if(sortKindNum == 2){
            //只返回 没有回答的
             List<Question> questions = questionService.queryAnswerZero(searchCriteria);
             return questions;
        } else {
        /*if(sortKindNum == 3){*/
            //热度排序（按浏览次数）
             List<Question> questions = questionService.queryByScanCnt(searchCriteria);
             return questions;
        }
    }


    @RequestMapping("/getTheQuestionById")
    @ResponseBody
    public Question getTheQuestionById(String id) {
        int idOfQuestion = Integer.parseInt(id);
        return questionService.queryById(idOfQuestion);
    }


    @RequestMapping("/getAnswerById")
    @ResponseBody
    public List<Answer> getAnswerById( String id, String page, String limit, String sortKind) {
        int idOfQuestion = Integer.parseInt(id);
        int pageNum = Integer.parseInt(page);
        int limitNum = Integer.parseInt(limit);
        int sortKindNum = Integer.parseInt(sortKind);

        //计算出limit的条件
        SearchCriteria searchCriteria = new SearchCriteria();
        searchCriteria.setId(idOfQuestion);
        searchCriteria.setTheBegin((pageNum) * limitNum);
        searchCriteria.setTheOver(limitNum);
        searchCriteria.setTheCriteria(sortKindNum);

        if(sortKindNum == 2){
            return questionService.getAnswerById(searchCriteria);
        } else {
            return questionService.getAnswerByTime(searchCriteria);
        }


    }


    @RequestMapping("/addAnswer")
    @ResponseBody
    public Answer addAnswer(String problemId,String answerId,String answer) {
        Answer answer1 = new Answer();
        answer1.setAnswer(answer);
        answer1.setProblemId(Integer.parseInt(problemId));
        answer1.setId(Integer.parseInt(answerId));
        questionService.insertAnswer(answer1);
        return answer1;
    }


    @RequestMapping("/getCountOfAnswerByProblemId")
    @ResponseBody
    public PageSolve getCountOfAnswerByProblemId(String id) {
        int idOfPro = Integer.parseInt(id);
        int count = questionService.getNumByProblemId(idOfPro);
        PageSolve pageSolve = new PageSolve();
        pageSolve.setCount(count);
        pageSolve.setPageCount(3);
        return pageSolve;
    }


    @RequestMapping("/addTheScanCount")
    @ResponseBody
    public Reply addTheScanCount( String idStr) {
        int id = Integer.parseInt(idStr);
        int s = questionService.addTheScanCount(id);
        Reply reply = new Reply();
        if(s > 0){
            reply.setReply("ok");
        } else {
            reply.setReply("error");
        }
        return reply;
    }

    @RequestMapping("/addTheAnsCount")
    @ResponseBody
    public Reply addTheAnsCount(String idStr) {
        int id = Integer.parseInt(idStr);
        int s = questionService.addTheAnsCount(id);
        Reply reply = new Reply();
        if(s > 0){
            reply.setReply("ok");
        } else {
            reply.setReply("error");
        }
        return reply;
    }


    @RequestMapping("/addTheSponsorCnt")
    @ResponseBody
    public Reply addTheSponsorCnt(String typeStr,String idOfStr,String authorIdStr) {
        int type = Integer.parseInt(typeStr);
        int typeTemp = 2;
        if(type == 2 || type == 1){
            typeTemp = 1;
        }//////////////////////////// 存入数据库的只有 1 和 2.否则混乱

        int idOf = Integer.parseInt(idOfStr);
        int authorId = Integer.parseInt(authorIdStr);
        Reply reply = new Reply();
        Sponsor sponsor = new Sponsor();
        sponsor.setIdOf(idOf);
        sponsor.setType(typeTemp);
        sponsor.setAuthorId(authorId);
        Sponsor sp = new Sponsor();
        int s = 0;
        int temp = 0;
        sp = questionService.sponsorCheck(sponsor);//先判断库存有没有
        if(sp == null) {
            //没有 先记录
            s = questionService.insertSponsor(sponsor);
            if (type == 1) { //1 问题 点赞
                temp = questionService.addTheSponserOfQuestion(idOf);
            } else if (type == 2) {//2 问题 踩
                temp = questionService.decTheSponserOfQuestion(idOf);
            } else if (type == 3) { //3 回答 点赞
                temp = questionService.addTheSponserOfAns(idOf);
            } else if (type == 4) {
                temp = questionService.decTheSponserOfAns(idOf);
            }
        }

        //有了就不用继续了
        if(temp == 0){
            reply.setReply("sorry");
        } else {
            reply.setReply("ok");
        }

        return reply;
    }

}
