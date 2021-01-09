package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:46
 */
public class Yearlyarticlecount {
    private Long count;
    private String year;
    public Yearlyarticlecount(){}

    public Yearlyarticlecount(Long count, String year) {
        this.count = count;
        this.year = year;
    }

    public Long getCount() {
        return count;
    }

    public String getYear() {
        return year;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
