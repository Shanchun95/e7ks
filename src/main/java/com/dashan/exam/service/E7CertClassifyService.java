package com.dashan.exam.service;

import com.dashan.exam.po.dto.E7CertClassifyDto;
import com.dashan.exam.po.vo.CertClassifyVo;
import com.dashan.exam.po.vo.E7CertClassifyVo;

import java.util.List;

/**
 * @ClassName: E7CertClassifyService
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/02/13  下午 11:40
 */
public interface E7CertClassifyService {
    //获取证书类别列表
    List<E7CertClassifyVo> selectList();
    //获取cert类表信息
    List<CertClassifyVo> selectCertList();
    //新增
    Integer addCertClassify(E7CertClassifyDto dto);
    //修改
    Integer updateCertClassify(E7CertClassifyDto dto);
    //删除
    Integer deleteCertClassify(Integer flg);
}
