package com.dashan.exam.service;

import com.dashan.exam.po.dto.E7UserDto;

/**
 * @ClassName: E7UserService
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/11  下午 4:45
 */
public interface E7UserService {
    // 根据id查询用户信息
    E7UserDto selectUserById(Integer id);
}
