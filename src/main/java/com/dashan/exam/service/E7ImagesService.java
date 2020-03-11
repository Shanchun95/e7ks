package com.dashan.exam.service;

import com.dashan.exam.po.E7Images;

/**
 * @ClassName: E7Images
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/08  下午 4:35
 */
public interface E7ImagesService {
    //根据图片id获取图片信息
    E7Images selectById(Integer id);
}
