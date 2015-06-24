package com.apollo.console.baseapi.user;

import com.apollo.console.user.bean.pojo.SysRoleFunc;

public interface SysRoleFuncMapper {
    int deleteByPrimaryKey(Long roleFuncId);

    int insert(SysRoleFunc record);

    int insertSelective(SysRoleFunc record);

    SysRoleFunc selectByPrimaryKey(Long roleFuncId);

    int updateByPrimaryKeySelective(SysRoleFunc record);

    int updateByPrimaryKey(SysRoleFunc record);
}