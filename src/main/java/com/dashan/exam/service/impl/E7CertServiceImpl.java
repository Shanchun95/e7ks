package com.dashan.exam.service.impl;

import com.dashan.exam.mapper.E7CertMapper;
import com.dashan.exam.po.E7Cert;
import com.dashan.exam.po.E7CertExample;
import com.dashan.exam.po.dto.E7CertDto;
import com.dashan.exam.service.E7CertService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: E7CertServiceImpl
 * @Description: TODO
 * @author: shanchun
 * @date: 2020/03/04  下午 2:12
 */
@Service
public class E7CertServiceImpl implements E7CertService {
    @Resource
    E7CertMapper e7CertMapper;
    /**
    * @Description: 根据id获取Cert信息
    * @Param: [id]
    * @return: com.dashan.exam.po.dto.E7CertDto
    * @Author: shanchun
    * @Date: 2020/03/06 上午 11:21
    **/
    @Override
    public E7CertDto selectCertById(Integer id) {
        E7Cert e7Cert = e7CertMapper.selectByPrimaryKey(id);
        if (e7Cert != null){
            E7CertDto dto = new E7CertDto();
            BeanUtils.copyProperties(e7Cert,dto);
            return dto;
        }
        return null;
    }

    /**
    * @Description: 新增/修改cert信息
    * @Param: [dto]
    * @return: java.lang.Integer
    * @Author: shanchun
    * @Date: 2020/03/06 上午 11:21
    **/
    @Override
    public Integer addCert(E7CertDto dto) {
        if (dto != null){
            E7CertExample example = new E7CertExample();
            E7CertExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(dto.getId());
            List<E7Cert> e7Certs = e7CertMapper.selectByExample(example);
            E7Cert e7Cert;
            if (!CollectionUtils.isEmpty(e7Certs)){
                e7Cert = e7Certs.get(0);
            }else {
                e7Cert = new E7Cert();
                e7Cert.setId(dto.getId());
            }
            if (!StringUtils.isEmpty(dto.getName())){
                e7Cert.setName(dto.getName());
            }
            if (dto.getImg() != null){
                e7Cert.setImg(dto.getImg());
            }
            if (dto.getStartDate() != null){

                e7Cert.setStartDate(dto.getStartDate());
            }
            if (!StringUtils.isEmpty(dto.getEnter())){
                e7Cert.setEnter(dto.getEnter());
            }
            if (!StringUtils.isEmpty(dto.getPoint())){
                e7Cert.setPoint(dto.getPoint());
            }
            if (!StringUtils.isEmpty(dto.getOutline())){
                e7Cert.setOutline(dto.getOutline());
            }
            if (!StringUtils.isEmpty(dto.getExam())){
                e7Cert.setExam(dto.getExam());
            }
            if (!StringUtils.isEmpty(dto.getKnow())){
                e7Cert.setKnow(dto.getKnow());
            }
            if (!StringUtils.isEmpty(dto.getCertGroup())){
                e7Cert.setCertGroup(dto.getCertGroup());
            }
            int insert;
            if (!CollectionUtils.isEmpty(e7Certs)){
                insert = e7CertMapper.updateByPrimaryKey(e7Cert);
            }else {
                insert = e7CertMapper.insert(e7Cert);
            }
            if (insert > 0){
                return 1;
            }else {
                return -1;
            }
        }
        return -1;
    }

    /**
    * @Description: 修改cert信息
    * @Param: [dto]
    * @return: java.lang.Integer
    * @Author: shanchun
    * @Date: 2020/03/06 上午 11:21
    **/
    @Override
    public Integer updateCert(E7CertDto dto) {
        return null;
    }

    /**
    * @Description: 删除cert信息
    * @Param: [id]
    * @return: java.lang.Integer
    * @Author: shanchun
    * @Date: 2020/03/06 上午 11:22
    **/
    @Override
    public Integer deleteCert(Integer id) {
        if (id != null && id != 0){
            int i = e7CertMapper.deleteByPrimaryKey(id);
            if (i > 0){
                return 1;
            }else {
                return -1;
            }
        }
        return -1;
    }
}
