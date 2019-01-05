package org.blue.web.pc.member.interceptors;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthAdminInterceptor  implements HandlerInterceptor{

	@Autowired 
	private DataSourceTransactionManager  transactionManager;
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse respone, Object handler, Exception e)
			throws Exception {

		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse respone, Object handler, ModelAndView mv)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse respone, Object handler) throws Exception {
		// TODO Auto-generated method stub
		boolean flag=false;
		String[] IGNORE_URI = {"/Login","/404.html","/index.jsp","/PasswordReset"};
		String servletPath=request.getServletPath();
		for(String s:IGNORE_URI){
			if(servletPath.contains(s)){
				flag=true;
				break;
			}
		}
		if(!flag){
			Map user=(Map<String,Object>)request.getSession().getAttribute("admins");
			if(user==null){
				Cookie[] cookies=request.getCookies();
				if(cookies==null)return false;
				for(Cookie cookie:cookies){//遍历cookie数组
				    if(!cookie.getName().equals("admins_out_user")) continue;
				    String cuser=cookie.getValue();
				    if(cuser.equals(""))break;
				    
				    if(flag)return flag;
				}
				request.setAttribute("message", "请先登录！");
				//request.getRequestDispatcher("/login").forward(request, respone);
				respone.sendRedirect("Login");
				return flag;
			}
			else{
				flag=((int)user.get("id")==1);
				if(!flag){
					respone.sendRedirect("Default");
				}
			}
		}
		return flag;
	}

}
