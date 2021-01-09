package com.example.paperdata.PO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 14:45
 */
public class Relationbetweenrefandcit {
    private Long ref;
    private Long cit;
    public Relationbetweenrefandcit(){}

    public Relationbetweenrefandcit(Long ref, Long cit) {
        this.ref = ref;
        this.cit = cit;
    }

    public Long getRef() {
        return ref;
    }

    public Long getCit() {
        return cit;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public void setCit(Long cit) {
        this.cit = cit;
    }
}
