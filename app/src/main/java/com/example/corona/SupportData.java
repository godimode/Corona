package com.example.corona;

public class SupportData {
    private String title;
    private String subTitle;
    private String comment;
    private String link;

    public SupportData(String title, String comment, String link){
        this.title = title;
        this.comment = comment;
        this.link = link;
    }

    public SupportData(String title, String subTitle, String comment, String link){
        this.title = title;
        this.subTitle = subTitle;
        this.comment = comment;
        this.link = link;
    }

    public String getTitle(){
        return title;
    }

    public String getSubTitle(){
        return subTitle;
    }

    public String getComment(){ return comment; }

    public String getLink(){
        return link;
    }
}
