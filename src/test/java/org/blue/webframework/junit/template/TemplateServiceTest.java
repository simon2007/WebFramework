package org.blue.webframework.junit.template;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestRollBackBase;
import org.blue.webframework.sys.template.service.TemplateService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractResourceBasedMessageSource;

public class TemplateServiceTest extends  SpringTestRollBackBase{

	@Resource
	private TemplateService templateService;
	
	@Autowired
	private AbstractResourceBasedMessageSource resourceBundleMessageSource;
	
	@Test
	public void test()
	{
		String message = resourceBundleMessageSource.getMessage("aaaa", null, "Default", Locale.CHINA);
	    System.out.println(message);
	    
		Map<String,Object> object=new HashMap<String,Object>();
		String content=templateService.processViewTemplate("email/test", object);
		System.out.println(content);
	}
}
