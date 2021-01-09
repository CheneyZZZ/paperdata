package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:46
 */
public class Top20citationsarticle {
    private Long citations;
    private String title;

    public Top20citationsarticle(){}

    public Top20citationsarticle(Long citations, String title) {
        this.citations = citations;
        this.title = title;
    }

    public Long getCitations() {
        return citations;
    }

    public String getTitle() {
        return title;
    }

    public void setCitations(Long citations) {
        this.citations = citations;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
