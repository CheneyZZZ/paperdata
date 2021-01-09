package com.example.paperdata.Dao;

import com.example.paperdata.PO.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 16:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ArticleMapperTest {
    @Autowired
    ArticleMapper articleMapper;


    //A fully automated greedy square jigsaw puzzle solver
    @Test
    public void seachArticlesTest(){
        List<SimpleArticle> res = articleMapper.searchArticles("automated");
        boolean flag = false;
        for(SimpleArticle article:res){
            if (article.getTitle().equals("A fully automated greedy square jigsaw puzzle solver")){
                flag=true;
            }
        }
        Assert.assertTrue(flag);
    }

    //Optimal similarity registration of volumetric images
    @Test
    public void seachArticlesWithYearTest(){
        List<SimpleArticle> res = articleMapper.searchArticlesWithYear("2011","registration of");
        boolean flag = false;
        for(SimpleArticle article:res){
            if (article.getTitle().equals("Optimal similarity registration of volumetric images")){
                flag=true;
            }
        }
        Assert.assertTrue(flag);
    }

    //Neural Rendering for Game Character Auto-creation
    @Test
    public void seachArticlesWithConfTest(){
        List<SimpleArticle> res = articleMapper.searchArticlesWithConf("IEEE Transactions on Pattern Analysis and Machine Intelligence","auto-creation");
        boolean flag = false;
        for(SimpleArticle article:res){
            if (article.getTitle().equals("Neural Rendering for Game Character Auto-creation")){
                flag=true;
            }
        }
        Assert.assertTrue(flag);
    }

    @Test
    public void seachArticlesWithYearAndConfTest(){
        List<SimpleArticle> res = articleMapper.searchArticlesWithYearAndConf("2019","2019 IEEE/CVF International Conference on Computer Vision (ICCV)","floor");
        boolean flag = false;
        for(SimpleArticle article:res){
            if (article.getTitle().equals("Floor-SP: Inverse CAD for Floorplans by Sequential Room-Wise Shortest Path")){
                flag=true;
            }
        }
        Assert.assertTrue(flag);
    }

    @Test
    public void getArticleTest(){
        Article article = articleMapper.getArticleById("5432214");
        Assert.assertNotNull(article);
        System.out.println(article.getTitle());
    }

    @Test
    public void getYearlyTest(){
        List<Yearlyarticlecount> res = articleMapper.getYearlyCount();
        Assert.assertTrue(res.size()==10);
        for(Yearlyarticlecount yearlyarticlecount:res){
            System.out.println(yearlyarticlecount.getYear()+" : "+yearlyarticlecount.getCount());
        }
    }

    @Test
    public void getTopTermsTest(){
        List<IEEE_term> res = articleMapper.getTop50Terms();
        Assert.assertTrue(res.size()==50);
        for(int i=0;i<10;i++){
            System.out.println(res.get(i).getWord());
        }
    }

    @Test
    public void getTopCitArticleTest(){
        List<Top20citationsarticle> res = articleMapper.getTop20CitAricle();
        Assert.assertTrue(res.size()==20);
        for(int i=0;i<10;i++){
            System.out.println(res.get(i).getTitle());
        }
    }

    @Test
    public void getRelationsTest(){
        List<Relationbetweenrefandcit> res = articleMapper.getRelations();
        Assert.assertTrue(res.size()==8421);
        for(int i=0;i<5;i++){
            System.out.println(res.get(i).getRef()+" : "+res.get(i).getCit());
        }
    }

    @Test
    public void getHotwordsTest(){
        List<Hotword> res =articleMapper.gethotwords();
        Assert.assertTrue(res.size()==1644);
        for(int i=0;i<5;i++){
            System.out.println(res.get(i).getWord());
        }
    }
}
