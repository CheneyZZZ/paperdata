package com.example.paperdata.Dao;

import com.example.paperdata.PO.Conferencerank;
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
public class ConferenceMapperTest {
    @Autowired
    ConferenceMapper conferenceMapper;

    @Test
    public void conferencerankTest(){
        List<Conferencerank> res = conferenceMapper.getConferenceCount();
        Assert.assertTrue(res.size()==16);
        for(int i=0;i<5;i++){
            System.out.println(res.get(i).getConference()+":"+res.get(i).getCount());
        }
    }
}
