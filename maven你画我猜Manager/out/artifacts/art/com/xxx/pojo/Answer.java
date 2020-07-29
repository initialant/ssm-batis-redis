package com.xxx.pojo;

import java.util.List;

public class Answer {
    private int id;
    private String answer;
    private int sponsorCnt;
    private String name;
    private String answerTime;
    private int problemId;

    private List<Answer> answers;

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", sponsorCnt=" + sponsorCnt +
                ", name='" + name + '\'' +
                ", answerTime='" + answerTime + '\'' +
                ", problem_id=" + problemId +
                ", list=" + answers +
                '}';
    }

    public int getProblemId() {
        return problemId;
    }

    public void setProblemId(int problemId) {
        this.problemId = problemId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getSponsorCnt() {
        return sponsorCnt;
    }

    public void setSponsorCnt(int sponsorCnt) {
        this.sponsorCnt = sponsorCnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }
}
