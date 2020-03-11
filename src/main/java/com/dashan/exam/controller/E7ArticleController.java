package com.dashan.exam.controller;

import com.dashan.exam.common.ResponseMap;
import com.dashan.exam.po.dto.E7ArticleDto;
import com.dashan.exam.service.E7ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: E7ArticleController
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/06  下午 4:56
 */
@Controller
@RequestMapping("article")
public class E7ArticleController {
    @Resource
    E7ArticleService e7ArticleService;

    @RequestMapping("select_artile_list")
    @ResponseBody
    @CrossOrigin
    public ResponseMap selectArticle(){
        List<E7ArticleDto> dtos = e7ArticleService.selectArticleList();
        if (!CollectionUtils.isEmpty(dtos)){
            return ResponseMap.success(dtos);
        }
        return ResponseMap.fail();
    }
}
