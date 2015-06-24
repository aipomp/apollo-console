<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<% String rootPath = request.getContextPath(); %>
<html>
    <head>
        <title>显示用户信息</title>
        <script type="text/javascript" src="<%=rootPath%>/res/extjs/adapter/ext/ext-base.js"></script>
		<script type="text/javascript" src="<%=rootPath%>/res/extjs/ext-all.js"></script>
		<script type="text/javascript" src="<%=rootPath%>/res/extjs/adapter/ext/ext-basex.js"></script>
		<script type="text/javascript" src="<%=rootPath%>/res/extjs/ext-lang-zh_CN.js"></script>
		<!-- jQuery库 -->
		<script type="text/javascript" src="<%=rootPath%>/res/jquery/jquery-1.6.4.min.js"></script>
		<script type="text/javascript" src="<%=rootPath%>/res/jquery/plugins/jquery.tmpl.min.js"></script>
        <script type="text/javascript">
        	var rootPath = "<%=rootPath %>";
        </script>
		
        
        <style type="text/css">
            table,td{
                border: 1px solid;
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
  	  普通用户可访问<a href="<%=request.getContextPath()%>/userdemo/getUserInfo" target="_blank">用户信息页面</a>
	<br/>
	<br/>
	管理员可访问<a href="<%=request.getContextPath()%>/page/listUser.jsp" target="_blank">用户列表页面</a>
	<br/>
	<br/>
	<a href="<%=request.getContextPath()%>/logincontroller/logout" target="_blank">Logout</a>
    	<div>显示后台返回的值:</div>
        <span id='test_span'>........</span>
    </body>
</html>