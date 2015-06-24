package com.apollo.console.baseapi.user;

import com.apollo.console.user.bean.pojo.SysOpRole;

public interface SysOpRoleMapper {
    int deleteByPrimaryKey(Long opRoleId);

    int insert(SysOpRole record);

    int insertSelective(SysOpRole record);

    SysOpRole selectByPrimaryKey(Long opRoleId);

    int updateByPrimaryKeySelective(SysOpRole record);

    int updateByPrimaryKey(SysOpRole record);
}