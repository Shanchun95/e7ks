package com.dashan.exam.service;

import com.dashan.exam.po.E7CertEntry;
import com.dashan.exam.po.dto.E7CertEntryDto;

import java.util.List;

/**
 * @ClassName: E7CertEntryService
 * @Description: 证书
 * @author: shanchun
 * @date: 2020/02/13  下午 10:58
 */
public interface E7CertEntryService {
    //产询证书列表
    List<E7CertEntry> selectList();
    //
    List<E7CertEntryDto> selectList(Integer flg);
    //新增
    Integer addCertEntry(E7CertEntryDto dto);
    //修改
    Integer updateCertEntry(E7CertEntryDto dto);
    //删除
    Integer deleteCertEntry(Integer flg);
}
