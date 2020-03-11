package com.dashan.exam.service.impl;

import com.dashan.exam.mapper.E7StaticAreaMapper;
import com.dashan.exam.po.E7StaticArea;
import com.dashan.exam.po.dto.E7StaticAreaDto;
import com.dashan.exam.service.E7StaticAreaService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: E7StaticAreaServiceImpl
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/11  下午 4:26
 */
@Service
public class E7StaticAreaServiceImpl implements E7StaticAreaService {
    @Resource
    E7StaticAreaMapper e7StaticAreaMapper;

    @Override
    public E7StaticAreaDto selectAreaById(Integer id) {
        E7StaticArea e7StaticArea = e7StaticAreaMapper.selectByPrimaryKey(id);
        if (e7StaticArea != null){
            E7StaticAreaDto dto = new E7StaticAreaDto();
            BeanUtils.copyProperties(e7StaticArea,dto);
            return dto;
        }
        return null;
    }
}
