package com.xxx.pojo;

public class SearchCriteria {
    private int theBegin;
    private int theOver;
    private int theCriteria;
    private int type;
    private int id;

    @Override
    public String toString() {
        return "SearchCriteria{" +
                "theBegin=" + theBegin +
                ", theOver=" + theOver +
                ", theCriteria=" + theCriteria +
                ", type=" + type +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public int getTheBegin() {
        return theBegin;
    }

    public void setTheBegin(int theBegin) {
        this.theBegin = theBegin;
    }

    public int getTheOver() {
        return theOver;
    }

    public void setTheOver(int theOver) {
        this.theOver = theOver;
    }

    public int getTheCriteria() {
        return theCriteria;
    }

    public void setTheCriteria(int theCriteria) {
        this.theCriteria = theCriteria;
    }
}
