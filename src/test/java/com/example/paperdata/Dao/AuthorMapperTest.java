package com.example.paperdata.Dao;

import com.example.paperdata.PO.Author;
import com.example.paperdata.PO.Top20author;
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
public class AuthorMapperTest {
    @Autowired
    AuthorMapper authorMapper;

    @Test
    public void getAuthorTest(){
        Author author = authorMapper.getAuthorById("37061938200");
        Assert.assertNotNull(author);
        System.out.println(author.getName());
    }

    @Test
    public void getTop20Test(){
        List<Top20author> res = authorMapper.getTopAuthor();
        Assert.assertTrue(res.size() == 20);
        for(int i=0;i<5;i++){
            System.out.println(res.get(i).getName());
        }
    }
}
