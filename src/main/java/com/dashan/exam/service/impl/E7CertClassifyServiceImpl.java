package com.dashan.exam.service.impl;

import com.dashan.exam.mapper.E7CertClassifyMapper;
import com.dashan.exam.po.E7CertClassify;
import com.dashan.exam.po.E7CertClassifyExample;
import com.dashan.exam.po.E7Images;
import com.dashan.exam.po.dto.E7CertClassifyDto;
import com.dashan.exam.po.dto.E7CertDto;
import com.dashan.exam.po.dto.E7CertEntryDto;
import com.dashan.exam.po.vo.CertClassifyVo;
import com.dashan.exam.po.vo.E7CertClassifyVo;
import com.dashan.exam.service.E7CertClassifyService;
import com.dashan.exam.service.E7CertEntryService;
import com.dashan.exam.service.E7CertService;
import com.dashan.exam.service.E7ImagesService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: E7CertClassifyServiceImpl
 * @Description: 证书分类
 * @author: shanchun
 * @date: 2020/02/13  下午 11:40
 */
@Service
public class E7CertClassifyServiceImpl implements E7CertClassifyService {
    @Resource
    E7CertClassifyMapper e7CertClassifyMapper;
    @Resource
    E7CertEntryService e7CertEntryService;
    @Resource
    E7CertService e7CertService;
    @Resource
    E7ImagesService e7ImagesService;
    //获取证书类别列表
    @Override
    public List<E7CertClassifyVo> selectList() {
        E7CertClassifyExample example = new E7CertClassifyExample();
        E7CertClassifyExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(0);
        List<E7CertClassify> e7CertClassifies = e7CertClassifyMapper.selectByExample(example);
        List<E7CertClassifyVo> vos1 = new ArrayList<>();
        if (!CollectionUtils.isEmpty(e7CertClassifies)){
            for (E7CertClassify e7CertClassify : e7CertClassifies){
                E7CertClassifyVo vo = new E7CertClassifyVo();
                vo.setId(e7CertClassify.getId());
                vo.setLabel(e7CertClassify.getName());
                vo.setLevel(1);
                E7CertClassifyExample example1 = new E7CertClassifyExample();
                E7CertClassifyExample.Criteria criteria1 = example1.createCriteria();
                criteria1.andParentIdEqualTo(e7CertClassify.getId());
                List<E7CertClassify> e7CertClassifies1 = e7CertClassifyMapper.selectByExample(example1);
                if (!CollectionUtils.isEmpty(e7CertClassifies1)){
                    List<E7CertClassifyVo> vos2 = new ArrayList<>();
                    for (E7CertClassify e7CertClassify1 : e7CertClassifies1){
                        E7CertClassifyVo vo2 = new E7CertClassifyVo();
                        vo2.setId(e7CertClassify1.getId());
                        vo2.setLabel(e7CertClassify1.getName());
                        vo2.setLevel(2);
                        List<E7CertEntryDto> dtos2 = e7CertEntryService.selectList(e7CertClassify1.getId());
                        List<E7CertClassifyVo> vos3 = new ArrayList<>();
                        if (!CollectionUtils.isEmpty(dtos2)){
                            for (E7CertEntryDto e7CertEntryDto : dtos2){
                                E7CertClassifyVo vo1 = new E7CertClassifyVo();
                                vo1.setId(e7CertEntryDto.getId());
                                vo1.setLabel(e7CertEntryDto.getName());
                                vo1.setSort(e7CertEntryDto.getSort());
                                vo1.setDes(e7CertEntryDto.getDes());
                                vo1.setClassify(e7CertEntryDto.getClassify());
                                vo1.setLevel(3);
                                vos3.add(vo1);
                            }
                        }
                        vo2.setChildren(vos3);
                        vos2.add(vo2);
                    }
                    vo.setChildren(vos2);
                }
                vos1.add(vo);
            }
        }
        return vos1;
    }
    //cert信息列表
    public List<CertClassifyVo> selectCertList(){
        E7CertClassifyExample example = new E7CertClassifyExample();
        E7CertClassifyExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(0);
        List<E7CertClassify> e7CertClassifies = e7CertClassifyMapper.selectByExample(example);
        List<CertClassifyVo> vos1 = new ArrayList<>();
        if (!CollectionUtils.isEmpty(e7CertClassifies)){
            for (E7CertClassify Classify : e7CertClassifies){
                CertClassifyVo vo = new CertClassifyVo();
                vo.setId(Classify.getId());
                vo.setName(Classify.getName());
                E7CertClassifyExample example1 = new E7CertClassifyExample();
                E7CertClassifyExample.Criteria criteria1 = example1.createCriteria();
                criteria1.andParentIdEqualTo(Classify.getId());
                List<E7CertClassify> e7CertClassifies1 = e7CertClassifyMapper.selectByExample(example1);
                if (!CollectionUtils.isEmpty(e7CertClassifies1)){
                    List<CertClassifyVo> vos2 = new ArrayList<>();
                    for (E7CertClassify e7CertClassify1 : e7CertClassifies1){
                        CertClassifyVo vo2 = new CertClassifyVo();
                        vo2.setId(e7CertClassify1.getId());
                        vo2.setName(e7CertClassify1.getName());
                        vo2.setHot(e7CertClassify1.getHot());
                        E7CertDto dto = e7CertService.selectCertById(e7CertClassify1.getId());
                        List<CertClassifyVo> vos3 = new ArrayList<>();
                        if (dto != null){
                            CertClassifyVo vo3 = new CertClassifyVo();
                            BeanUtils.copyProperties(dto,vo3);
                            E7Images e7Images = e7ImagesService.selectById(dto.getImg());
                            if (e7Images != null){
                                vo3.setImg(e7Images.getPath());
                            }
                            vos3.add(vo3);
                            vo2.setChildren(vos3);
                        }
                        vos2.add(vo2);
                    }
                    vo.setChildren(vos2);
                }
                vos1.add(vo);
            }
        }
        return vos1;
    }
    //根据类别id获取该类别信息
    public List<E7CertClassifyVo> selectList(Integer id) {
        E7CertClassifyExample example = new E7CertClassifyExample();
        E7CertClassifyExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<E7CertClassify> e7CertClassifies = e7CertClassifyMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(e7CertClassifies)){
            E7CertClassify e7CertClassify = e7CertClassifies.get(0);
//            if (e7CertClassify.get)
        }
        return null;
    }

    //新增
    @Override
    public Integer addCertClassify(E7CertClassifyDto dto) {
        E7CertClassify e7CertClassify = new E7CertClassify();
        if (dto.getHot() != null){
            e7CertClassify.setHot(dto.getHot());
        }
        if (!StringUtils.isEmpty(dto.getName())){
            e7CertClassify.setName(dto.getName());
        }
        if (dto.getParentId() != null){
            e7CertClassify.setParentId(dto.getParentId());
        }
        int insert = e7CertClassifyMapper.insert(e7CertClassify);
        if (insert > 0){
            E7CertClassifyExample example = new E7CertClassifyExample();
            E7CertClassifyExample.Criteria criteria = example.createCriteria();
            criteria.andNameEqualTo(dto.getName());
            criteria.andParentIdEqualTo(dto.getParentId());
            List<E7CertClassify> e7CertClassifies = e7CertClassifyMapper.selectByExample(example);
            if (!CollectionUtils.isEmpty(e7CertClassifies)){
                Integer id = e7CertClassifies.get(0).getId();
                return id;
            }
        }
        return -1;
    }
    //修改
    public Integer updateCertClassify(E7CertClassifyDto dto){
        E7CertClassify e7CertClassify = new E7CertClassify();
        if (dto.getId() == null){
            return 0;
        }
        if (dto.getHot() != null){
            e7CertClassify.setHot(dto.getHot());
        }
        if (!StringUtils.isEmpty(dto.getName())){
            e7CertClassify.setName(dto.getName());
        }
        if (dto.getParentId() != null){
            e7CertClassify.setParentId(dto.getParentId());
        }
        e7CertClassify.setId(dto.getId());
        E7CertClassifyExample example = new E7CertClassifyExample();
        E7CertClassifyExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(dto.getId());
        int i = e7CertClassifyMapper.updateByExample(e7CertClassify, example);
        return i;
    }
    //删除
    @Override
    public Integer deleteCertClassify(Integer flg) {
        E7CertClassifyExample example = new E7CertClassifyExample();
        E7CertClassifyExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(flg);
        int i = e7CertClassifyMapper.deleteByExample(example);
        return i;
    }

}
