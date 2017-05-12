package com.second.mapper;

import com.second.model.Sell;
import com.second.model.SellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellDAO {
    long countByExample(SellExample example);

    int deleteByExample(SellExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sell record);

    int insertSelective(Sell record);

    List<Sell> selectByExample(SellExample example);

    Sell selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByExample(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByPrimaryKeySelective(Sell record);

    int updateByPrimaryKey(Sell record);
}