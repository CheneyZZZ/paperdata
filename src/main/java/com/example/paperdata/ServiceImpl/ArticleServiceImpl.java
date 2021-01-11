package com.example.paperdata.ServiceImpl;

import com.example.paperdata.Dao.ArticleMapper;
import com.example.paperdata.PO.*;
import com.example.paperdata.Service.ArticleService;
import com.example.paperdata.VO.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:38
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public ResponseVO getArticleById(String id){
        try {
            Article article = articleMapper.getArticleById(id);
            return ResponseVO.buildSuccess(article);
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
    @Override
    public ResponseVO searchArticles(String year,String conference,String keywords){
        try {
            System.out.println(year+"~y  "+conference+"~c  "+keywords+"~k  ");
            Set<SimpleArticle> res = new HashSet<>();
            String[] keys = keywords.split("\\s+");
            for(String key:keys){
                List<SimpleArticle> temp;
                if(year.length()==0&&conference.length()==0){
                    temp = articleMapper.searchArticles(key);
                }else if(year.length()==0){
                    temp = articleMapper.searchArticlesWithConf(conference,key);
                }else if(conference.length()==0){
                    temp = articleMapper.searchArticlesWithYear(year,key);
                }else {
                    temp = articleMapper.searchArticlesWithYearAndConf(year,conference,key);
                }
                for(SimpleArticle sa:temp){
                    res.add(sa);
                }
            }
            return ResponseVO.buildSuccess(new ArrayList<>(res));
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
    @Override
    public ResponseVO getYearlyCount(){
        try {
            List<Yearlyarticlecount> res = articleMapper.getYearlyCount();
            Collections.reverse(res);
            return ResponseVO.buildSuccess(res);
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
    @Override
    public ResponseVO getTop50Terms(){
        try {
            List<IEEE_term> res = articleMapper.getTop50Terms();
            return ResponseVO.buildSuccess(res);
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
    @Override
    public ResponseVO getTop20Citation(){
        try {
            List<Top20citationsarticle> res = articleMapper.getTop20CitAricle();
            return ResponseVO.buildSuccess(res);
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
    @Override
    public ResponseVO getRelationBetweenCitAndRef(){
        try {
            List<Relationbetweenrefandcit> res = articleMapper.getRelations();
            return ResponseVO.buildSuccess(res);
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
    @Override
    public ResponseVO getHotwords(){
        try {
            List<Hotword> res = articleMapper.gethotwords();
            return ResponseVO.buildSuccess(res);
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
}
