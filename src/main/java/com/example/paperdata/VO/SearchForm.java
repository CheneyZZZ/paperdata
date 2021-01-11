package com.example.paperdata.VO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-11 16:04
 */
public class SearchForm {
    private String year;
    private String conference;
    private String keys;
    
    public SearchForm(){}

    public SearchForm(String year, String conference, String keys) {
        this.year = year;
        this.conference = conference;
        this.keys = keys;
    }

    public String getYear() {
        return year;
    }

    public String getConference() {
        return conference;
    }

    public String getKeys() {
        return keys;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}
