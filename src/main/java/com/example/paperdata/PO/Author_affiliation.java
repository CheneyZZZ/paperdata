package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:43
 */
public class Author_affiliation {
    private String author_id;
    private String affiliation;

    public Author_affiliation(){

    }

    public Author_affiliation(String author_id, String affiliation) {
        this.author_id = author_id;
        this.affiliation = affiliation;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }
}
