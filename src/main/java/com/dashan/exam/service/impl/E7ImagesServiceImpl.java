package com.dashan.exam.service.impl;

import com.dashan.exam.mapper.E7ImagesMapper;
import com.dashan.exam.po.E7Images;
import com.dashan.exam.po.dto.E7ImagesDto;
import com.dashan.exam.service.E7ImagesService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;

/**
 * @ClassName: E7ImagesServiceImpl
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/08  下午 4:37
 */
@Service
public class E7ImagesServiceImpl implements E7ImagesService {
    @Resource
    E7ImagesMapper e7ImagesMapper;
    @Override
    public E7Images selectById(Integer id) {
        if (id != 0 && id != null){
            E7Images e7Images = e7ImagesMapper.selectByPrimaryKey(id);
            if (e7Images != null){
                E7ImagesDto dto = new E7ImagesDto();
                BeanUtils.copyProperties(e7Images,dto);
                return e7Images;
            }
        }
        return null;
    }
}
