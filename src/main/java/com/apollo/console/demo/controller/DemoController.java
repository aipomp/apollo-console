package com.apollo.console.demo.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apollo.console.common.controller.BaseController;
import com.apollo.console.demo.bean.CompInst;
import com.apollo.console.demo.service.CompInstService;

/**
 * @author gacl
 * @WebServlet是Servlet3.0提供的注解，目的是将一个继承了HttpServlet类的普通java类标注为一个Servlet
 * UserServlet使用了@WebServlet标注之后，就不需要在web.xml中配置了
 */
@Controller
@RequestMapping("/demo/test")
public class DemoController  extends BaseController{
	@Autowired
	private CompInstService compInstService;
	
	
	@RequestMapping(value="/getCompDesc")
	public void startStopActivity(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//异常处理test	
		throw new SQLException();
//		long compInstId = Long.parseLong(request.getParameter("compInstId"));
//		String name = request.getParameter("name");
//		
//		log.info("中文的参数：" +  name);
//		CompInst compInst = compInstService.selectByPrimaryKey(compInstId);
//		response.getWriter().print(compInst.getCompInstDesc());
	}
}
