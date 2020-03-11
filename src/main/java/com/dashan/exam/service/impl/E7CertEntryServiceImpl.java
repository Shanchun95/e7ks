package com.dashan.exam.service.impl;

import com.dashan.exam.mapper.E7CertEntryMapper;
import com.dashan.exam.po.E7CertEntry;
import com.dashan.exam.po.E7CertEntryExample;
import com.dashan.exam.po.dto.E7CertEntryDto;
import com.dashan.exam.service.E7CertEntryService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: E7CertEntryServiceImpl
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/02/13  下午 10:58
 */
@Service
public class E7CertEntryServiceImpl implements E7CertEntryService {
    @Resource
    private E7CertEntryMapper e7CertEntryMapper;
    //查询证件列表
    @Override
    public List<E7CertEntry> selectList() {
        E7CertEntryExample example = new E7CertEntryExample();
        E7CertEntryExample.Criteria criteria = example.createCriteria();
        List<E7CertEntry> e7CertEntries = e7CertEntryMapper.selectByExampleWithBLOBs(example);
        if (CollectionUtils.isEmpty(e7CertEntries)){
            return null;
        }
        return e7CertEntries;
    }
    //根据cert查询
    public List<E7CertEntryDto> selectList(Integer flg){
        E7CertEntryExample example = new E7CertEntryExample();
        E7CertEntryExample.Criteria criteria = example.createCriteria();
        criteria.andCertIdEqualTo(flg);
        List<E7CertEntry> e7CertEntries = e7CertEntryMapper.selectByExampleWithBLOBs(example);
        List<E7CertEntryDto> dtos = new ArrayList<>();
        if (!CollectionUtils.isEmpty(e7CertEntries)){
            for (E7CertEntry e7CertEntry : e7CertEntries){
                E7CertEntryDto dto = new E7CertEntryDto();
                BeanUtils.copyProperties(e7CertEntry,dto);
                dtos.add(dto);
            }
        }
        return dtos;
    }
    //新增/修改
    @Override
    public Integer addCertEntry(E7CertEntryDto dto) {
        E7CertEntry e7CertEntry = new E7CertEntry();
        if (dto.getCertId() != null){
            e7CertEntry.setCertId(dto.getCertId());
        }
        if (!StringUtils.isEmpty(dto.getName())){
            e7CertEntry.setName(dto.getName());
        }
        if (dto.getSort() != null){
            e7CertEntry.setSort(dto.getSort());
        }
        if (!StringUtils.isEmpty(dto.getDes())){
            e7CertEntry.setDes(dto.getDes());
        }
        e7CertEntry.setClassify(dto.getClassify());
        e7CertEntry.setOption(dto.getOption());
        e7CertEntry.setExam(dto.getExam());
        e7CertEntry.setHard(dto.getHard());
        e7CertEntry.setView(dto.getView());
        int i = e7CertEntryMapper.insert(e7CertEntry);
        if (i > 0){
            E7CertEntryExample example = new E7CertEntryExample();
            E7CertEntryExample.Criteria criteria = example.createCriteria();
            criteria.andCertIdEqualTo(dto.getCertId());
            criteria.andNameEqualTo(dto.getName());
            List<E7CertEntry> e7CertEntries = e7CertEntryMapper.selectByExample(example);
            if (!CollectionUtils.isEmpty(e7CertEntries)){
                Integer id = e7CertEntries.get(0).getId();
                return id;
            }
        }
        return -1;
    }
    //修改
    @Override
    public Integer updateCertEntry(E7CertEntryDto dto) {
        E7CertEntryExample example = new E7CertEntryExample();
        E7CertEntryExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(dto.getId());
        E7CertEntry e7CertEntry = new E7CertEntry();
        if (dto.getCertId() != null){
            e7CertEntry.setCertId(dto.getCertId());
        }
        if (!StringUtils.isEmpty(dto.getName())){
            e7CertEntry.setName(dto.getName());
        }
        if (dto.getSort() != null){
            e7CertEntry.setSort(dto.getSort());
        }
        if (!StringUtils.isEmpty(dto.getDes())){
            e7CertEntry.setDes(dto.getDes());
        }
        e7CertEntry.setClassify(dto.getClassify());
        int i = e7CertEntryMapper.updateByExampleSelective(e7CertEntry,example);
        return i;
    }
    //删除
    @Override
    public Integer deleteCertEntry(Integer flg) {
        E7CertEntryExample example = new E7CertEntryExample();
        E7CertEntryExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(flg);
        int i = e7CertEntryMapper.deleteByExample(example);
        return i;
    }
}
