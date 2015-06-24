package com.apollo.console.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apollo.console.baseapi.user.SysFuncMapper;
import com.apollo.console.user.bean.pojo.SysFunc;
import com.apollo.console.user.service.UserInfoService;
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
	@Resource(name="sysFuncMapper")
	private SysFuncMapper sysFuncMapper;
	@Override
	//查询用户的功能菜单
	public List<SysFunc> queryUserFuncs(long opId) throws Exception {
		return sysFuncMapper.selectFuncByOpId(opId);
	}
}
