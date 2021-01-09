package com.example.paperdata.Dao;

import com.example.paperdata.PO.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:08
 */

@Service
@Mapper
public interface ArticleMapper {
    public Article getArticleById(String id);
    public List<SimpleArticle> searchArticlesWithYearAndConf(String year,String conference,String key);
    public List<SimpleArticle> searchArticlesWithYear(String year,String key);
    public List<SimpleArticle> searchArticlesWithConf(String conference,String key);
    public List<SimpleArticle> searchArticles(String key);
    public List<Yearlyarticlecount> getYearlyCount();
    public List<IEEE_term> getTop50Terms();
    public List<Top20citationsarticle> getTop20CitAricle();
    public List<Relationbetweenrefandcit> getRelations();
    public List<Hotword> gethotwords();
}
