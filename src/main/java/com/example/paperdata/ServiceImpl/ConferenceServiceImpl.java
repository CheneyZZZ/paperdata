package com.example.paperdata.ServiceImpl;

import com.example.paperdata.Dao.ConferenceMapper;
import com.example.paperdata.PO.Conferencerank;
import com.example.paperdata.Service.ConferenceService;
import com.example.paperdata.VO.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:40
 */
@Service
public class ConferenceServiceImpl implements ConferenceService {
    @Autowired
    ConferenceMapper conferenceMapper;
    @Override
    public ResponseVO getConferenceCount(){
        try {
            List<Conferencerank> res = conferenceMapper.getConferenceCount();
            return ResponseVO.buildSuccess(res);
        }catch (Exception e){
            //e.printStackTrace();
            return ResponseVO.buildFailure("error");
        }
    }
}
