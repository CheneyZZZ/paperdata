package com.example.paperdata.Service;

import com.example.paperdata.VO.ResponseVO;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:39
 */
public interface AuthorService {
    public ResponseVO getAuthorById(String id);
    public ResponseVO getTop20Author();
}
