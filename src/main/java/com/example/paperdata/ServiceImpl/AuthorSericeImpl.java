package com.example.paperdata.ServiceImpl;

import com.example.paperdata.Dao.AuthorMapper;
import com.example.paperdata.PO.Author;
import com.example.paperdata.PO.Top20author;
import com.example.paperdata.Service.AuthorService;
import com.example.paperdata.VO.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:39
 */
@Service
public class AuthorSericeImpl implements AuthorService {
    @Autowired
    AuthorMapper authorMapper;
    @Override
    public ResponseVO getAuthorById(String id){
        try {
            Author author = authorMapper.getAuthorById(id);
            return ResponseVO.buildSuccess(author);
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
    @Override
    public ResponseVO getTop20Author(){
        try {
            List<Top20author> res = authorMapper.getTopAuthor();
            return ResponseVO.buildSuccess(res);
        }catch (Exception e){
            return ResponseVO.buildFailure("error");
        }
    }
}
