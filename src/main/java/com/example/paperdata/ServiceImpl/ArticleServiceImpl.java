package com.example.paperdata.ServiceImpl;

import com.example.paperdata.Service.ArticleService;
import com.example.paperdata.VO.ResponseVO;
import org.springframework.stereotype.Service;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:38
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public ResponseVO getArticleById(String id){
        return null;
    }
    @Override
    public ResponseVO searchArticles(String year,String conference,String keywords){
        return null;
    }
    @Override
    public ResponseVO getYearlyCount(){
        return null;
    }
    @Override
    public ResponseVO getTop50Terms(){
        return null;
    }
    @Override
    public ResponseVO getTop20Citation(){
        return null;
    }
    @Override
    public ResponseVO getRelationBetweenCitAndRef(){
        return null;
    }
    @Override
    public ResponseVO getHotwords(){
        return null;
    }
}
