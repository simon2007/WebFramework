package org.blue.webframework.sys.template.service.impl;

import java.util.Locale;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.blue.webframework.exception.SystemException;
import org.blue.webframework.sys.template.service.TemplateService;
import org.blue.webframework.sys.template.util.ThymeleafHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service("TemplateService")
class TemplateServiceImpl implements TemplateService {

	private Logger logger = LogManager.getLogger(getClass());


	@Autowired
    private ApplicationContext applicationContext;

	@Autowired(required=false)
    private TemplateEngine templateEngine;
    

    private TemplateEngine getTemplateEngine()
    {
    	if(templateEngine == null)
    	{
    		if(logger.isDebugEnabled())
    			logger.debug("create default");
    	templateEngine=new ThymeleafHelper().emailTemplateEngine(applicationContext);
    	}
    	return templateEngine;
    }
    
	
	public String processViewTemplate(String viewName, Map<String, Object> variables, Locale locale) {
		try {

			Context ctx = new Context(locale);
			ctx.setVariables(variables);
			String content = getTemplateEngine().process(viewName, ctx);
			logger.info("viewName="+viewName);
			return content;
		} catch (Exception e) {
			throw new SystemException("0003", e);
		}
	}

	@Override
	public String processViewTemplate(String viewName, Map<String, Object> variables) {
		return processViewTemplate(viewName, variables, Locale.CHINA);
	}


	@Override
	public String processUrlTemplate(String url, Map<String, Object> data) {

		return null;
	}

}
