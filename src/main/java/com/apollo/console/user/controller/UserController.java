package com.apollo.console.user.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apollo.console.user.bean.pojo.SysOp;

@Controller
@RequestMapping("userdemo")
public class UserController {
  @RequestMapping(value="/getUserInfo")
  public void getUserInfo(HttpServletRequest request,HttpServletResponse response) throws Exception{
    SysOp currentUser = (SysOp)request.getSession().getAttribute("currentUser");
    System.out.println("当前登录的用户为[" + currentUser + "]");
    request.setAttribute("currUser", currentUser);
    try {
		response.sendRedirect(request.getContextPath()+"/page/user/info.jsp");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//成功页面
  }
}