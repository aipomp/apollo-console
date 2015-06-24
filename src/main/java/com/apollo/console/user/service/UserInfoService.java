package com.apollo.console.user.service;

import java.util.List;

import com.apollo.console.user.bean.pojo.SysFunc;

public interface UserInfoService {
	public List<SysFunc> queryUserFuncs(long opId) throws Exception;
}
