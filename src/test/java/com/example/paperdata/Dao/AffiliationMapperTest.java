package com.example.paperdata.Dao;

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
 * @date 2021-01-09 16:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AffiliationMapperTest {
    @Autowired
    AffiliationMapper affiliationMapper;

    @Test
    public void top20Test(){
        List<String> res = affiliationMapper.getTop20Affiliation();
        Assert.assertTrue(res.size()==20);
        for(String aff:res){
            System.out.println(aff);
        }
    }
}