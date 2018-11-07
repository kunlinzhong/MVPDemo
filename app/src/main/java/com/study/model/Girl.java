package com.study.model;

public class Girl {
    private String title;
    private String content;

    public Girl(String title,String content){
        setTitle(title);
        setContent(content);
    }

    public void setTitle(String title){this.title = title;}
    public String getTitle() {return title; }

    public void setContent(String content){this.content = content;}
    public String getContent(){return content;}
}
