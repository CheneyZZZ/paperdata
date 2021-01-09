package com.example.paperdata.Controller;

import com.example.paperdata.VO.ResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:12
 */

@RestController
@RequestMapping("/article")
public class ArticleController {

    /**
     * 获得文章详细信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public ResponseVO getArticleById(@RequestParam("id")String id){
        return null;
    }

    /**
     * 搜索文章
     * @param year 年份
     * @param conference 会议
     * @param keys 搜索关键字
     * @return
     */
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public ResponseVO searchArticles(@RequestParam("year")String year,@RequestParam("conference")String conference,@RequestParam("keys")String keys){
        return null;
    }

    /**
     * 每年发表文章数
     * @return
     */
    @RequestMapping(value = "/yearly",method = RequestMethod.GET)
    public ResponseVO getYearlyCount(){
        return null;
    }

    /**
     * 最热的IEEE术语
     * @return
     */
    @RequestMapping(value = "/terms",method = RequestMethod.GET)
    public ResponseVO getTop50Terms(){
        return null;
    }

    /**
     * 被引用最多的20篇文章
     * @return
     */
    @RequestMapping(value = "/topcitation",method = RequestMethod.GET)
    public ResponseVO getTop20Citation(){
        return null;
    }

    /**
     * 文章引用数与被引用数的关系
     * @return
     */
    @RequestMapping(value = "relation", method = RequestMethod.GET)
    public ResponseVO getRelationBetweenCitAndRef(){
        return null;
    }

    /**
     * 所有文章的最热关键字
     * @return
     */
    @RequestMapping(value = "hotword",method = RequestMethod.GET)
    public ResponseVO getHotwords(){
        return null;
    }


}
