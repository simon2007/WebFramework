package org.blue.webframework.sys.email.service.impl;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.blue.webframework.sys.email.service.EmailService;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.blue.webframework.sys.template.service.TemplateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EmailService")
class EmailServiceImpl implements EmailService{
	private final Logger logger = LogManager.getLogger(getClass());

	@Resource
	private SiteParameterService siteParameterService;
	
	@Autowired
	private TemplateService templateService;
	
	
	
	
	private Session getMailSession()
	{
		Properties properties = new Properties();

		properties.put("mail.smtp.host", siteParameterService.getParamValue("smtp",""));
		// 验证
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", siteParameterService.getParamValue("smtpport","25"));
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.starttls.enable", "true");// Enable TLS
		// 根据属性新建一个邮件会话
		Session mailSession = Session.getInstance(properties, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(siteParameterService.getParamValue("smtpuser",""),siteParameterService.getParamValue("smtppwd",""));
			}
		});
		mailSession.setDebug(false);
		return mailSession;
	}
	
	
	private void sendEmail(String[] mutliTo, String subject, String content)
	{
		Session mailSession=getMailSession();
		
		for (int i = 0, j = mutliTo.length; i < j; i++) {
			try {

				// 建立消息对象
				MimeMessage mailMessage = new MimeMessage(mailSession);

				// 发件人
				mailMessage.setFrom(new InternetAddress(siteParameterService.getParamValue("smtpuser")));
				// 收件人
				mailMessage.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(mutliTo[i].trim()));
				// 主题
				mailMessage.setSubject(subject);
				// 把邮件内容设置为html网页格式，编码格式为tf-8
				mailMessage.setContent(content, "text/html;charset=utf-8");
				
				// 发信时间
				mailMessage.setSentDate(new Date());
				// 存储信息
				mailMessage.saveChanges();
				// Transport trans = mailSession.getTransport("smtp");
				// 发送
				Transport.send(mailMessage);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	/**
	 * @Title:sendEmailNew
	 * @Description: 发送邮件信息
	 * @param: mutliTo 前面页面穿过来的emailString
	 * @param: subject 邮件标题
	 * @param: content 邮件内容
	 * @Date:2014年8月5日20:32:10
	 */
	@Override
	public void sendEmailNew( String subject, String content,String... mutliTo) {
		if(mutliTo == null || mutliTo.length<=0)
		{
			logger.info("mutliTo is empty, use errorMailTo");
			mutliTo = siteParameterService.getParamValue("errorMailTo", "simon2007@163.com").split(",");
		}
		sendEmail(mutliTo,subject,content);
	}

	@Override
	public void sendEmailWithModelAndView(String[] mutliTo, String subject, String viewName, Map<String, Object> data) {
		String content=templateService.processViewTemplate(viewName, data);
		sendEmail(mutliTo,subject,content);
	}

	@Override
	public void sendEmailWithUrl(String[] mutliTo, String subject, String url, Map<String, Object> data) {
		String content=templateService.processUrlTemplate(url, data);
		sendEmail(mutliTo,subject,content);
		
	}
	
	
}
