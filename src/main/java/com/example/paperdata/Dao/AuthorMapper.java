package com.example.paperdata.Dao;

import com.example.paperdata.PO.Author;
import com.example.paperdata.PO.SimpleArticle;
import com.example.paperdata.PO.Top20author;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:09
 */

@Service
@Mapper
public interface AuthorMapper {
    public Author getAuthorById(String id);
    public List<Top20author> getTopAuthor();
    public List<SimpleArticle> getAuthorArticle(String id);

}
