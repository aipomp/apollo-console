<%@ page language="java" pageEncoding="UTF-8"%>
<!-- extjs库 -->
<script type="text/javascript" src="<%= request.getContextPath()%>/res/extjs/ext-all.js"></script>
<script type="text/javascript" src="<%= request.getContextPath()%>/res/extjs/ext-lang-zh_CN.js"></script>
<!-- jQuery库 -->
<script type="text/javascript" src="<%= request.getContextPath()%>/res/jquery/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="<%= request.getContextPath()%>/res/jquery/plugins/jquery.tmpl.min.js"></script>
<script type="text/javascript">
//验证码逻辑
function reloadVerifyCode() {
	var imgSrc = $("#verifyCodeImage");
	var src = imgSrc.attr("src");
	imgSrc.attr("src", chgUrl(src));
}
function chgUrl(url) {
	var timestamp = (new Date()).valueOf();
	newurl = url + "?timestamp=" + timestamp;
	return newurl;
}
</script>
<div style="color:red; font-size:22px;">${message_login}</div>
<form action="<%=request.getContextPath()%>/logincontroller/login" method="POST">
	  姓名：<input type="text" name="username"/><br/>
	  密码：<input type="text" name="password"/><br/>
	  验证：<input type="text" name="verifyCode"/>
       
     <img id="verifyCodeImage" onclick="reloadVerifyCode()" src="<%=request.getContextPath()%>/logincontroller/getVerifyCodeImage"/><br/>
     <input type="submit" value="确认"/>
</form>