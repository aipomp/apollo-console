package com.apollo.console.user.controller;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apollo.console.baseapi.user.SysOpMapper;
import com.apollo.console.common.controller.BaseController;
import com.apollo.console.common.util.VerifyCodeUtil;
import com.apollo.console.user.bean.pojo.SysFunc;
import com.apollo.console.user.bean.pojo.SysOp;
import com.apollo.console.user.service.UserInfoService;


/**
 * 用户登录的controller方法
 * @author jiass3
 *
 */
@Controller
@RequestMapping("logincontroller")
public class LoginController extends BaseController{
  private static Logger logger  = Logger.getLogger(LoginController.class);
  @Resource(name="sysOpMapper")
  private SysOpMapper sysOpMapper;
  
  @Autowired
  private UserInfoService userInfoService;
  /**
   * 获取验证码图片和文本(验证码文本会保存在HttpSession中)
   */
  @RequestMapping("/getVerifyCodeImage")
  public void getVerifyCodeImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
    //设置页面不缓存
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", 0);
    String verifyCode = VerifyCodeUtil.generateTextCode(VerifyCodeUtil.TYPE_NUM_ONLY, 4, null);
    //将验证码放到HttpSession里面
    request.getSession().setAttribute("verifyCode", verifyCode);
    logger.debug("本次生成的验证码为[" + verifyCode + "],已存放到HttpSession中");
    //设置输出的内容的类型为JPEG图像
    response.setContentType("image/jpeg");
    BufferedImage bufferedImage = VerifyCodeUtil.generateImageCode(verifyCode, 90, 30, 3, true, Color.WHITE, Color.BLACK, null);
    //写给浏览器
    ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());
  }
  
  
  /**
   * 用户登录方法
   */
  @RequestMapping(value="/login", method=RequestMethod.POST)
  public void login(HttpServletRequest request,HttpServletResponse response) throws Exception{
    String resultPageURL = "";
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    //获取HttpSession中的验证码
    String verifyCode = (String)request.getSession().getAttribute("verifyCode");
    //获取用户请求表单中输入的验证码
    String submitCode = WebUtils.getCleanParam(request, "verifyCode");
    logger.debug("用户[" + username + "]登录时输入的验证码为[" + submitCode + "],HttpSession中的验证码为[" + verifyCode + "]");
    if (StringUtils.isEmpty(submitCode) || !StringUtils.equals(verifyCode, submitCode.toLowerCase())){
       request.setAttribute("message_login", "验证码不正确");
    }
    UsernamePasswordToken token = new UsernamePasswordToken(username, password);
    token.setRememberMe(true);
    logger.debug("为了验证登录用户而封装的token为" + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));
    //获取当前的Subject
    Subject currentUser = SecurityUtils.getSubject();
    try {
      //在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查
      //每个Realm都能在必要时对提交的AuthenticationTokens作出反应
      //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法
      logger.debug("对用户[" + username + "]进行登录验证..验证开始");
      currentUser.login(token);
      logger.debug("对用户[" + username + "]进行登录验证..验证通过");
    }catch(UnknownAccountException uae){
      logger.debug("对用户[" + username + "]进行登录验证..验证未通过,未知账户");
      request.getSession().setAttribute("message_login", "未知账户");
    }catch(IncorrectCredentialsException ice){
      logger.debug("对用户[" + username + "]进行登录验证..验证未通过,错误的凭证");
      request.getSession().setAttribute("message_login", "密码不正确");
    }catch(LockedAccountException lae){
      logger.debug("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");
      request.getSession().setAttribute("message_login", "账户已锁定");
    }catch(ExcessiveAttemptsException eae){
      logger.debug("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");
      request.getSession().setAttribute("message_login", "用户名或密码错误次数过多");
    }catch(AuthenticationException ae){
      //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景
      logger.debug("对用户[" + username + "]进行登录验证..验证未通过,堆栈轨迹如下");
      ae.printStackTrace();
      request.getSession().setAttribute("message_login", "用户名或密码不正确");
    }
	//验证是否登录成功
    if(currentUser.isAuthenticated()){
      logger.debug("用户[" + username + "]登录认证通过");
      //初始化用户菜单权限
      SysOp user = (SysOp)request.getSession().getAttribute("currentUser");
      List<SysFunc> funcList  = userInfoService.queryUserFuncs(user.getOpId());
      request.getSession().setAttribute("userMenu", funcList);
	  response.sendRedirect(request.getContextPath()+"/page/index.jsp");
    }else{
      //失败调转到登录页面
      token.clear();
      response.sendRedirect(request.getContextPath()+"/login.jsp");
    }
  }
  
  /**
   * 用户登出
   */
  @RequestMapping("/logout")
  public void logout(HttpServletRequest request,HttpServletResponse response) throws Exception{
	     SecurityUtils.getSubject().logout();
	     request.getSession().setAttribute("message_login", "用户成功退出，请重新登录");
	     response.sendRedirect(request.getContextPath()+"/login.jsp");
  }
  
}