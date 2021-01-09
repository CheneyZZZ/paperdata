package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:59
 */
public class IEEE_term {
    private String word;
    private int count;
    public IEEE_term(){}

    public IEEE_term(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
