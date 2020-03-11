package com.dashan.exam.service;

import com.dashan.exam.po.dto.E7CertDto;

/**
 * @ClassName: 入口信息
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/04  下午 2:13
 */
public interface E7CertService {
    //根据id查询入口信息
    E7CertDto selectCertById(Integer id);
    //新增
    Integer addCert(E7CertDto dto);
    //修改
    Integer updateCert(E7CertDto dto);
    //删除
    Integer deleteCert(Integer id);
}
