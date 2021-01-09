package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:42
 */
public class Article {
    private String id;
    private String title;
    private String conference;
    private String year;
    private int reference_count;
    private int citation_count;
    private String pdf_link;
    private String text;
    private String keywords;
    private String IEEE_terms;

    public Article(){}

    public Article(String id, String title, String conference, String year, int reference_count, int citation_count, String pdf_link, String text, String keywords, String IEEE_terms) {
        this.id = id;
        this.title = title;
        this.conference = conference;
        this.year = year;
        this.reference_count = reference_count;
        this.citation_count = citation_count;
        this.pdf_link = pdf_link;
        this.text = text;
        this.keywords = keywords;
        this.IEEE_terms = IEEE_terms;
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

    public int getReference_count() {
        return reference_count;
    }

    public int getCitation_count() {
        return citation_count;
    }

    public String getPdf_link() {
        return pdf_link;
    }

    public String getText() {
        return text;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getIEEE_terms() {
        return IEEE_terms;
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

    public void setReference_count(int reference_count) {
        this.reference_count = reference_count;
    }

    public void setCitation_count(int citation_count) {
        this.citation_count = citation_count;
    }

    public void setPdf_link(String pdf_link) {
        this.pdf_link = pdf_link;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setIEEE_terms(String IEEE_terms) {
        this.IEEE_terms = IEEE_terms;
    }
}
