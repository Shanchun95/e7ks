package com.dashan.exam.po;

public class E7ArticleWithBLOBs extends E7Article {
    private String des;

    private String content;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}