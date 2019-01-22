package org.blue.webframework.junit.siteParameter;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestRollBackBase;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.junit.Test;


public class SiteParameterServiceTest extends SpringTestRollBackBase {

	@Resource
	private SiteParameterService siteParameter;
	
	@Test
	public void siteParameterGetTest()
	{
		siteParameter.putParamValue("smtp", "abc");
		String smtp=siteParameter.getParamValue("smtp");
		assertNotNull(smtp);
		System.out.println(smtp);
	}
}
