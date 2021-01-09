package com.example.paperdata.ServiceImpl;

import com.example.paperdata.Service.AuthorService;
import com.example.paperdata.VO.ResponseVO;
import org.springframework.stereotype.Service;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:39
 */
@Service
public class AuthorSericeImpl implements AuthorService {
    @Override
    public ResponseVO getAuthorById(String id){
        return null;
    }
    @Override
    public ResponseVO getTop20Author(){
        return null;
    }
}
