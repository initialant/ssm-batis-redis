package com.xxx.pojo;

public class Sponsor {
    private int id;
    private int type;  //user
    private int idOf;
    private int authorId;

    @Override
    public String toString() {
        return "Sponsor{" +
                "id=" + id +
                ", type=" + type +
                ", idOf=" + idOf +
                ", authorId=" + authorId +
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

    public int getIdOf() {
        return idOf;
    }

    public void setIdOf(int idOf) {
        this.idOf = idOf;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
