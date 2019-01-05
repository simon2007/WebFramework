package org.blue.sys.email.service;

import java.util.Map;
/***************************************************************
 * @Copyright (c) by anhui tonghui information technology Co., Ltd.
 * @All right reserved.
 * @File Name: EmailService.java
 * @Function: 邮件相关业务处理服务接口.<br> 此接口定义：邮件的增加、删除、查询、详细.<br>
 * @author zhaodongyun@itonghui.org
 * @date 2014年8月1日18:28:01
 * @Version : V50
 * @Last Update Date:2014年8月5日20:50:21
 * @Change Log: 添加重新发送以及重新发送成功之后更新数据状态的方法
 ****************************************************************/
public interface EmailService {

	/**
	* @Title: sendEmailNew 
	* @Description: 进行邮件发送的方法
	* @Date: Aug 5, 2014 4:27:34 PM
	* @Author: zhaodongyun@itonghui.org 
	* @param mutliTo controler中传递过来的String数组
	* 				 包括关于邮件发送的一系列数据
	* @param subject 邮件标题
	* @param content 邮件内容
	 */
	public void sendEmailNew(String[] mutliTo, String subject, String content);
	
	/**
	* @Title: sendEmailNew 
	* @Description: 进行邮件发送的方法
	* @Date: Aug 5, 2014 4:27:34 PM
	* @Author: zhaodongyun@itonghui.org 
	* @param mutliTo controler中传递过来的String数组
	* 				 包括关于邮件发送的一系列数据
	* @param subject 邮件标题
	* @param content 邮件内容
	 */
	public void sendEmailWithModelAndView(String[] mutliTo, String subject, String viewName,Map<String,String> data);
	
	public void sendEmailWithUrl(String[] mutliTo, String subject, String url,Map<String,String> data);
}