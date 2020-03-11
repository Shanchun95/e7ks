package com.dashan.exam.mapper;

import com.dashan.exam.po.E7CertClassify;
import com.dashan.exam.po.E7CertClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface E7CertClassifyMapper {
    long countByExample(E7CertClassifyExample example);

    int deleteByExample(E7CertClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(E7CertClassify record);

    int insertSelective(E7CertClassify record);

    List<E7CertClassify> selectByExample(E7CertClassifyExample example);

    E7CertClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") E7CertClassify record, @Param("example") E7CertClassifyExample example);

    int updateByExample(@Param("record") E7CertClassify record, @Param("example") E7CertClassifyExample example);

    int updateByPrimaryKeySelective(E7CertClassify record);

    int updateByPrimaryKey(E7CertClassify record);
}