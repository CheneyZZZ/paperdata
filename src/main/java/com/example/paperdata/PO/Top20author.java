package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:45
 */
public class Top20author {
    private Long articles;
    private String name;
    public Top20author(){}

    public Top20author(Long articles, String name) {
        this.articles = articles;
        this.name = name;
    }

    public Long getArticles() {
        return articles;
    }

    public String getName() {
        return name;
    }

    public void setArticles(Long articles) {
        this.articles = articles;
    }

    public void setName(String name) {
        this.name = name;
    }
}
