package com.example.paperdata.ServiceImpl;

import com.example.paperdata.Dao.AffiliationMapper;
import com.example.paperdata.Service.AffiliationService;
import com.example.paperdata.VO.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:38
 */
@Service
public class AffiliationServiceImpl implements AffiliationService {
    @Autowired
    AffiliationMapper affiliationMapper;
    @Override
    public ResponseVO getTop20Affiliation(){
        try {
            List<String> res = affiliationMapper.getTop20Affiliation();
            return ResponseVO.buildSuccess(res);
        }catch (Exception e){
            //e.printStackTrace();
            return ResponseVO.buildFailure("error");
        }
    }
}
