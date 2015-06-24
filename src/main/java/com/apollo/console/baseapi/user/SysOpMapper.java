package com.apollo.console.baseapi.user;

import com.apollo.console.user.bean.pojo.SysOp;

public interface SysOpMapper {
    int deleteByPrimaryKey(Long opId);

    int insert(SysOp record);

    int insertSelective(SysOp record);

    SysOp selectByPrimaryKey(Long opId);

    int updateByPrimaryKeySelective(SysOp record);

    int updateByPrimaryKey(SysOp record);
    
    SysOp selectByCodeAndPassword(SysOp record);
}