package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 17:24
 */
public class SimpleArticle {
    private String id;
    private String title;
    private String conference;
    private String year;

    public SimpleArticle(){}

    public SimpleArticle(String id, String title, String conference, String year) {
        this.id = id;
        this.title = title;
        this.conference = conference;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getConference() {
        return conference;
    }

    public String getYear() {
        return year;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
