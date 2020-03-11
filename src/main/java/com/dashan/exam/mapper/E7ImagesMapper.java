package com.dashan.exam.mapper;

import com.dashan.exam.po.E7Images;
import com.dashan.exam.po.E7ImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface E7ImagesMapper {
    long countByExample(E7ImagesExample example);

    int deleteByExample(E7ImagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(E7Images record);

    int insertSelective(E7Images record);

    List<E7Images> selectByExample(E7ImagesExample example);

    E7Images selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") E7Images record, @Param("example") E7ImagesExample example);

    int updateByExample(@Param("record") E7Images record, @Param("example") E7ImagesExample example);

    int updateByPrimaryKeySelective(E7Images record);

    int updateByPrimaryKey(E7Images record);
}