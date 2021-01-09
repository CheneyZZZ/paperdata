package com.example.paperdata.Controller;

import com.example.paperdata.Service.ConferenceService;
import com.example.paperdata.VO.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:12
 */
@RestController
@RequestMapping("/conference")
public class ConferenceController {
    @Autowired
    ConferenceService conferenceService;
    /**
     * 每个会议所有的论文数
     * @return
     */
    @RequestMapping(value = "/count",method = RequestMethod.GET)
    public ResponseVO getConferenceCount(){
        return conferenceService.getConferenceCount();
    }
}
