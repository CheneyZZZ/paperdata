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
