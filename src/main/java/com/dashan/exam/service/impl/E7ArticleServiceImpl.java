package com.dashan.exam.service.impl;

import com.dashan.exam.mapper.E7ArticleMapper;
import com.dashan.exam.po.E7Article;
import com.dashan.exam.po.E7ArticleExample;
import com.dashan.exam.po.E7Images;
import com.dashan.exam.po.dto.E7ArticleDto;
import com.dashan.exam.po.dto.E7StaticAreaDto;
import com.dashan.exam.po.dto.E7UserDto;
import com.dashan.exam.service.E7ArticleService;
import com.dashan.exam.service.E7ImagesService;
import com.dashan.exam.service.E7StaticAreaService;
import com.dashan.exam.service.E7UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: E7ArticleServiceImpl
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/06  下午 4:42
 */
@Service
public class E7ArticleServiceImpl implements E7ArticleService {

    @Resource
    E7ArticleMapper e7ArticleMapper;
    @Resource
    E7ImagesService e7ImagesService;
    @Resource
    E7StaticAreaService e7StaticAreaService;
    @Resource
    E7UserService e7UserService;

    @Override
    public List<E7ArticleDto> selectArticleList() {
        E7ArticleExample example = new E7ArticleExample();
        E7ArticleExample.Criteria criteria = example.createCriteria();
        List<E7Article> e7Articles = e7ArticleMapper.selectByExample(example);
        List<E7ArticleDto> dtos = new ArrayList<>();
        if (!CollectionUtils.isEmpty(e7Articles)){
            for (E7Article e7Article : e7Articles){
                E7ArticleDto dto = new E7ArticleDto();
                BeanUtils.copyProperties(e7Article,dto);
                E7Images e7Images = e7ImagesService.selectById(e7Article.getCoverImg());
                if (e7Articles != null){
                    dto.setImgPath(e7Images.getPath());
                }
                E7StaticAreaDto e7StaticAreaDto = e7StaticAreaService.selectAreaById(e7Article.getAreaId());
                if (e7StaticAreaDto != null){
                    dto.setArea(e7StaticAreaDto.getName());
                }
                E7UserDto e7UserDto = e7UserService.selectUserById(e7Article.getAuthor());
                if (e7UserDto != null){
                    dto.setAuthor(e7UserDto.getUsername());
                }
                dtos.add(dto);
            }
        }
        return dtos;
    }
}
