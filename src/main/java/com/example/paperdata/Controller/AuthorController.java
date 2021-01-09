package com.example.paperdata.Controller;

import com.example.paperdata.VO.ResponseVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcy
 * @version 1.0
 * @date 2021-01-09 15:12
 */
@RestController
@RequestMapping("/author")
public class AuthorController {

    /**
     * 获得作者详细信息
     * @param id 作者id
     * @return
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public ResponseVO getAuthorById(@RequestParam("id")String id){
        return null;
    }

    /**
     * 产量最高的20个作者
     * @return
     */
    @RequestMapping(value = "/top",method = RequestMethod.GET)
    public ResponseVO getTop20Author(){
        return null;
    }

}
