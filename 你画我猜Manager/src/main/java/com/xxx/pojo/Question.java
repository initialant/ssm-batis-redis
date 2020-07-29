package com.xxx.pojo;

import java.util.List;

public class Question {
    private int id;
    private String title;
    private int type;
    private int author;
    private String descAboutTitle;
    private String createTime;


    //回答数、浏览数、投票数
    private int answerCnt;
    private int scanCnt;
    private int voteCnt;

    //label
    private int firstLabel;
    private int secondLabel;
    private int thirdLabel;

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", author=" + author +
                ", descAboutTitle='" + descAboutTitle + '\'' +
                ", createTime='" + createTime + '\'' +
                ", answerCnt=" + answerCnt +
                ", scanCnt=" + scanCnt +
                ", voteCnt=" + voteCnt +
                ", firstLabel=" + firstLabel +
                ", secondLabel=" + secondLabel +
                ", thirdLabel=" + thirdLabel +
                ", name='" + name + '\'' +
                ", questions=" + questions +
                '}';
    }

    public int getFirstLabel() {
        return firstLabel;
    }

    public void setFirstLabel(int firstLabel) {
        this.firstLabel = firstLabel;
    }

    public int getSecondLabel() {
        return secondLabel;
    }

    public void setSecondLabel(int secondLabel) {
        this.secondLabel = secondLabel;
    }

    public int getThirdLabel() {
        return thirdLabel;
    }

    public void setThirdLabel(int thirdLabel) {
        this.thirdLabel = thirdLabel;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnswerCnt() {
        return answerCnt;
    }

    public void setAnswerCnt(int answerCnt) {
        this.answerCnt = answerCnt;
    }

    public int getScanCnt() {
        return scanCnt;
    }

    public void setScanCnt(int scanCnt) {
        this.scanCnt = scanCnt;
    }

    public int getVoteCnt() {
        return voteCnt;
    }

    public void setVoteCnt(int voteCnt) {
        this.voteCnt = voteCnt;
    }

    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }


    public Question(int id, String title, int type, int author, String description, String time) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.author = author;
        this.descAboutTitle = description;
        this.createTime = time;
    }

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getDescAboutTitle() {
        return descAboutTitle;
    }

    public void setDescAboutTitle(String descAboutTitle) {
        this.descAboutTitle = descAboutTitle;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
