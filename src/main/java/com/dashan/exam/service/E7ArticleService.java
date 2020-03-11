package com.dashan.exam.service;

import com.dashan.exam.po.dto.E7ArticleDto;

import java.util.List;

/**
 * @ClassName: E7ArticleService
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/06  下午 4:00
 */
public interface E7ArticleService {
    //获取文章类表
    List<E7ArticleDto> selectArticleList();
    //
    //
}
