package com.example.paperdata.Controller;

import com.example.paperdata.Service.AffiliationService;
import com.example.paperdata.VO.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:11
 */
@RestController
@RequestMapping("/affiliation")
public class AffiliationController {

    @Autowired
    AffiliationService affiliationService;
    /**
     * 产量最高的20个机构
     * @return
     */
    @RequestMapping(value = "/top",method = RequestMethod.GET)
    public ResponseVO getTop20Affiliation(){
        return affiliationService.getTop20Affiliation();
    }
}
