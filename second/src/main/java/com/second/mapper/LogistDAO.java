package com.second.mapper;

import com.second.model.Logist;
import com.second.model.LogistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogistDAO {
    long countByExample(LogistExample example);

    int deleteByExample(LogistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Logist record);

    int insertSelective(Logist record);

    List<Logist> selectByExampleWithBLOBs(LogistExample example);

    List<Logist> selectByExample(LogistExample example);

    Logist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Logist record, @Param("example") LogistExample example);

    int updateByExampleWithBLOBs(@Param("record") Logist record, @Param("example") LogistExample example);

    int updateByExample(@Param("record") Logist record, @Param("example") LogistExample example);

    int updateByPrimaryKeySelective(Logist record);

    int updateByPrimaryKeyWithBLOBs(Logist record);

    int updateByPrimaryKey(Logist record);
}