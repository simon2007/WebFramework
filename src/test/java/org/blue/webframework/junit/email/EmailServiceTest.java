package org.blue.webframework.junit.email;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestRollBackBase;
import org.blue.webframework.sys.email.service.EmailService;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.junit.Before;
import org.junit.Test;

public class EmailServiceTest extends SpringTestRollBackBase {

	@Resource
	private EmailService emailService;
	
	@Resource
	private SiteParameterService siteParameterService;
	
	//@Before
	public void init()
	{
		siteParameterService.putParamValue("smtp", "smtp.tom.com");
		siteParameterService.putParamValue("smtpuser","123456@tom.com");
		siteParameterService.putParamValue("smtppwd", "123456");
	}
	
	@Test
	public void sendEmailTest()
	{
		emailService.sendEmailNew( "test", "content");
	}
}
