package com.dashan.exam.mapper;

import com.dashan.exam.po.E7Article;
import com.dashan.exam.po.E7ArticleExample;
import com.dashan.exam.po.E7ArticleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface E7ArticleMapper {
    long countByExample(E7ArticleExample example);

    int deleteByExample(E7ArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(E7ArticleWithBLOBs record);

    int insertSelective(E7ArticleWithBLOBs record);

    List<E7ArticleWithBLOBs> selectByExampleWithBLOBs(E7ArticleExample example);

    List<E7Article> selectByExample(E7ArticleExample example);

    E7ArticleWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") E7ArticleWithBLOBs record, @Param("example") E7ArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") E7ArticleWithBLOBs record, @Param("example") E7ArticleExample example);

    int updateByExample(@Param("record") E7Article record, @Param("example") E7ArticleExample example);

    int updateByPrimaryKeySelective(E7ArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(E7ArticleWithBLOBs record);

    int updateByPrimaryKey(E7Article record);
}