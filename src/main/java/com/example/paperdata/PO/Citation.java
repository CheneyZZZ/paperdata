package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:44
 */
public class Citation {
    private String article_id;
    private String link;
    public Citation(){

    }

    public Citation(String article_id, String link) {
        this.article_id = article_id;
        this.link = link;
    }

    public String getArticle_id() {
        return article_id;
    }

    public String getLink() {
        return link;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
