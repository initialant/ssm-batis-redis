package com.xxx.pojo;

public class Reply {
    private String reply;
    private int replyState;

    @Override
    public String toString() {
        return "Reply{" +
                "reply='" + reply + '\'' +
                ", replyState=" + replyState +
                '}';
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public int getReplyState() {
        return replyState;
    }

    public void setReplyState(int replyState) {
        this.replyState = replyState;
    }

    public Reply(String reply, int replyState) {
        this.reply = reply;
        this.replyState = replyState;
    }

    public Reply() {
    }
}
