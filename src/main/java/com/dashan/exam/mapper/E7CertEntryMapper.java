package com.dashan.exam.mapper;

import com.dashan.exam.po.E7CertEntry;
import com.dashan.exam.po.E7CertEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface E7CertEntryMapper {
    long countByExample(E7CertEntryExample example);

    int deleteByExample(E7CertEntryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(E7CertEntry record);

    int insertSelective(E7CertEntry record);

    List<E7CertEntry> selectByExampleWithBLOBs(E7CertEntryExample example);

    List<E7CertEntry> selectByExample(E7CertEntryExample example);

    E7CertEntry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") E7CertEntry record, @Param("example") E7CertEntryExample example);

    int updateByExampleWithBLOBs(@Param("record") E7CertEntry record, @Param("example") E7CertEntryExample example);

    int updateByExample(@Param("record") E7CertEntry record, @Param("example") E7CertEntryExample example);

    int updateByPrimaryKeySelective(E7CertEntry record);

    int updateByPrimaryKeyWithBLOBs(E7CertEntry record);

    int updateByPrimaryKey(E7CertEntry record);
}