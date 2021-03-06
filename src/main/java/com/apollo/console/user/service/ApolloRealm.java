package com.apollo.console.user.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import com.apollo.console.baseapi.user.SysOpMapper;
import com.apollo.console.user.bean.pojo.SysOp;

/**
 * 自定义的指定Shiro验证用户登录的类
 * @see 在本例中定义了2个用户:jadyer和玄玉,jadyer具有admin角色和admin:manage权限,玄玉不具有任何角色和权限
 * @create Sep 29, 2013 3:15:31 PM
 * @author jiass3
 */
public class ApolloRealm extends AuthorizingRealm {
  @Resource(name="sysOpMapper")
  private SysOpMapper sysOpMapper;
  private static Logger logger  = Logger.getLogger(ApolloRealm.class);
  /**
   * 为当前登录的Subject授予角色和权限
   * @see 经测试:本例中该方法的调用时机为用户[jadyer]登录后,在访问/admin/listUser.jsp时被调用
   * @see 下面两种情境都不会调用本方法
   * @see 1)用户[jadyer]登录后,访问/user/info.jsp时
   * @see 2)用户[玄玉]登录后,访问/admin/listUser.jsp时
   */
  @Override
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    //获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()
    String currentUsername = (String)super.getAvailablePrincipal(principals);
//		List<String> roleList = new ArrayList<String>();
//		List<String> permissionList = new ArrayList<String>();
//		//从数据库中获取当前登录用户的详细信息
//		User user = userService.getByUsername(currentUsername);
//		if(null != user){
//			//实体类User中包含有用户角色的实体类信息
//			if(null!=user.getRoles() && user.getRoles().size()>0){
//				//获取当前登录用户的角色
//				for(Role role : user.getRoles()){
//					roleList.add(role.getName());
//					//实体类Role中包含有角色权限的实体类信息
//					if(null!=role.getPermissions() && role.getPermissions().size()>0){
//						//获取权限
//						for(Permission pmss : role.getPermissions()){
//							if(!StringUtils.isEmpty(pmss.getPermission())){
//								permissionList.add(pmss.getPermission());
//							}
//						}
//					}
//				}
//			}
//		}else{
//			throw new AuthorizationException();
//		}
//		//为当前用户设置角色和权限
//		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
//		simpleAuthorInfo.addRoles(roleList);
//		simpleAuthorInfo.addStringPermissions(permissionList);
    SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
    //实际中可能会像上面注释的那样从数据库取得
    if(null!=currentUsername && "jadyer".equals(currentUsername)){
      //添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色  
      simpleAuthorInfo.addRole("admin");
      //添加权限
      simpleAuthorInfo.addStringPermission("admin:manage");
      System.out.println("已为用户[jadyer]赋予了[admin]角色和[admin:manage]权限");
      return simpleAuthorInfo;
    }else if(null!=currentUsername && "玄玉".equals(currentUsername)){
      return simpleAuthorInfo;
    }else{
    	
    }
    return null;
  }
 
  /**
   * 验证当前登录的Subject
   * @see 经测试:本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()时
   */
  @Override
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
    //获取基于用户名和密码的令牌
    //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
    //两个token的引用都是一样的,本例中是org.apache.shiro.authc.UsernamePasswordToken@33799a1e
    UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
    SysOp record = new SysOp();
    record.setLoginCode(token.getUsername());
    record.setLoginPasswd(String.valueOf(token.getPassword()));
	SysOp user = sysOpMapper.selectByCodeAndPassword(record);
	if(null != user){
		AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getLoginCode(), user.getLoginPasswd(), user.getOpName());
		this.setSession("currentUser", user);
		logger.debug("登录用户名："+user.getLoginCode());
		return authcInfo;
	}else{
		return null;
	}
    //没有返回登录用户名对应的SimpleAuthenticationInfo对象时,就会在LoginController中抛出UnknownAccountException异常
  }
  
  
  /**
   * 将一些数据放到ShiroSession中,以便于其它地方使用
   * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
   */
  private void setSession(Object key, Object value) {
    Subject currentUser = SecurityUtils.getSubject();
    if(null != currentUser){
      Session session = currentUser.getSession();
      if(null != session){
        session.setAttribute(key, value);
      }
    }
  }
}