package com.dashan.exam.mapper;

import com.dashan.exam.po.E7User;
import com.dashan.exam.po.E7UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface E7UserMapper {
    long countByExample(E7UserExample example);

    int deleteByExample(E7UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(E7User record);

    int insertSelective(E7User record);

    List<E7User> selectByExample(E7UserExample example);

    E7User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") E7User record, @Param("example") E7UserExample example);

    int updateByExample(@Param("record") E7User record, @Param("example") E7UserExample example);

    int updateByPrimaryKeySelective(E7User record);

    int updateByPrimaryKey(E7User record);
}