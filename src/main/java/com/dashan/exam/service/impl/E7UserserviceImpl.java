package com.dashan.exam.service.impl;

import com.dashan.exam.mapper.E7UserMapper;
import com.dashan.exam.po.E7User;
import com.dashan.exam.po.dto.E7UserDto;
import com.dashan.exam.service.E7UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: E7UserserviceImpl
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/11  下午 4:49
 */
@Service
public class E7UserserviceImpl implements E7UserService {
    @Resource
    E7UserMapper e7UserMapper;

    @Override
    public E7UserDto selectUserById(Integer id) {
        E7User e7User = e7UserMapper.selectByPrimaryKey(id);
        if (e7User != null){
            E7UserDto dto = new E7UserDto();
            BeanUtils.copyProperties(e7User,dto);
            return dto;
        }
        return null;
    }
}
