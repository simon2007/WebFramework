package org.blue.framework.permission;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.blue.sys.account.service.PrivilegeService;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * 权限控制标签
 * @author lian
 * @date 2016年6月29日
 */
public class PermissionTag extends SimpleTagSupport{
	
	private final static String SESSION_ROLE_ID = "SESSION_ROLE_ID";

	private long role;
	private String action;
	private String resource;
	
	
	
	@Override
	public void doTag() throws JspException, IOException {
		PrivilegeService roleResourceService=getSpringBean(PrivilegeService.class);
		//判断是否有权限
		if(roleResourceService.hasRolePermission(getRole(), action, resource)){
			this.getJspBody().invoke(null);
		}
	}
	
	/**
	 * 获取spring的bean
	 * @author lian
	 * @date 2016年6月29日
	 * @param beanName
	 * @return
	 */
	private <T> T getSpringBean(Class<T> serviceType){
	
		WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
		return webApplicationContext.getBean(serviceType);
	}
	
	private long getRole(){
		if( role <=0 ){
			Object roleId=getPageContext().getSession().getAttribute(SESSION_ROLE_ID);
			if(roleId ==null)
				return 0;
			role =(Long) roleId;
		}
		return role;
	}
	
	public void setRole(long role) {
		this.role = role;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public void setResource(String resource) {
		this.resource = resource;
	}
	
	private PageContext getPageContext(){
		return ((PageContext)this.getJspContext());
	}
}
