package com.apollo.console.baseapi.user;

import java.util.List;

import com.apollo.console.user.bean.pojo.SysFunc;

public interface SysFuncMapper {
    int deleteByPrimaryKey(Long funcId);

    int insert(SysFunc record);

    int insertSelective(SysFunc record);

    SysFunc selectByPrimaryKey(Long funcId);

    int updateByPrimaryKeySelective(SysFunc record);

    int updateByPrimaryKey(SysFunc record);
    
    List<SysFunc> selectFuncByOpId(Long opId);
}