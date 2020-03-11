package com.dashan.exam.service;


import com.dashan.exam.po.E7StaticArea;
import com.dashan.exam.po.dto.E7StaticAreaDto;

/**
 * @ClassName: E7StaticAreaService
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/11  下午 4:19
 */
public interface E7StaticAreaService {

    //根据id获取地址信息
    E7StaticAreaDto selectAreaById(Integer id);
}
