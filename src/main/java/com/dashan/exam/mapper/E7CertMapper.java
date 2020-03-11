package com.dashan.exam.mapper;

import com.dashan.exam.po.E7Cert;
import com.dashan.exam.po.E7CertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface E7CertMapper {
    long countByExample(E7CertExample example);

    int deleteByExample(E7CertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(E7Cert record);

    int insertSelective(E7Cert record);

    List<E7Cert> selectByExample(E7CertExample example);

    E7Cert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") E7Cert record, @Param("example") E7CertExample example);

    int updateByExample(@Param("record") E7Cert record, @Param("example") E7CertExample example);

    int updateByPrimaryKeySelective(E7Cert record);

    int updateByPrimaryKey(E7Cert record);
}