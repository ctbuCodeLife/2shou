package com.second.mapper;

import com.second.model.Releave;
import com.second.model.ReleaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleaveDAO {
    long countByExample(ReleaveExample example);

    int deleteByExample(ReleaveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Releave record);

    int insertSelective(Releave record);

    List<Releave> selectByExampleWithBLOBs(ReleaveExample example);

    List<Releave> selectByExample(ReleaveExample example);

    Releave selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Releave record, @Param("example") ReleaveExample example);

    int updateByExampleWithBLOBs(@Param("record") Releave record, @Param("example") ReleaveExample example);

    int updateByExample(@Param("record") Releave record, @Param("example") ReleaveExample example);

    int updateByPrimaryKeySelective(Releave record);

    int updateByPrimaryKeyWithBLOBs(Releave record);

    int updateByPrimaryKey(Releave record);
}