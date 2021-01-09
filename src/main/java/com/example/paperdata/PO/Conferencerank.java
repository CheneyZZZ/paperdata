package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:44
 */
public class Conferencerank {
    private Long count;
    private String conference;
    public Conferencerank(){}

    public Conferencerank(Long count, String conference) {
        this.count = count;
        this.conference = conference;
    }

    public Long getCount() {
        return count;
    }

    public String getConference() {
        return conference;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }
}
