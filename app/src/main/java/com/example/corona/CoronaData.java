package com.example.corona;

public class CoronaData {
    private int icon;
    private String title;
    private String comments;

    public CoronaData(int icon, String title, String comments) {
        this.icon = icon;
        this.title = title;
        this.comments = comments;
    }

    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getComments() {
        return comments;
    }
}
