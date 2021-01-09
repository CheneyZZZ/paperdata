package com.example.paperdata.Controller;

import com.example.paperdata.VO.ResponseVO;
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
    /**
     * 每个会议所有的论文数
     * @return
     */
    @RequestMapping(value = "/count",method = RequestMethod.GET)
    public ResponseVO getConferenceCount(){
        return null;
    }
}
