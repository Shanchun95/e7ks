package com.dashan.exam.mapper;

import com.dashan.exam.po.E7StaticArea;
import com.dashan.exam.po.E7StaticAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface E7StaticAreaMapper {
    long countByExample(E7StaticAreaExample example);

    int deleteByExample(E7StaticAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(E7StaticArea record);

    int insertSelective(E7StaticArea record);

    List<E7StaticArea> selectByExample(E7StaticAreaExample example);

    E7StaticArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") E7StaticArea record, @Param("example") E7StaticAreaExample example);

    int updateByExample(@Param("record") E7StaticArea record, @Param("example") E7StaticAreaExample example);

    int updateByPrimaryKeySelective(E7StaticArea record);

    int updateByPrimaryKey(E7StaticArea record);
}