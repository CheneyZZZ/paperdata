package com.example.paperdata.Service;

import com.example.paperdata.VO.ResponseVO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:38
 */
public interface ArticleService {
    public ResponseVO getArticleById(String id);
    public ResponseVO searchArticles(String year,String conference,String keywords);
    public ResponseVO getYearlyCount();
    public ResponseVO getTop50Terms();
    public ResponseVO getTop20Citation();
    public ResponseVO getRelationBetweenCitAndRef();
    public ResponseVO getHotwords();
}
