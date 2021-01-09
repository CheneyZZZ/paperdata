package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:43
 */
public class Article_author {
    private int article_id;
    private int author_id;

    public Article_author(){

    }

    public Article_author(int article_id, int author_id) {
        this.article_id = article_id;
        this.author_id = author_id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }
}
