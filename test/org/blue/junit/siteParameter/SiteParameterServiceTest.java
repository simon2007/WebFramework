package org.blue.junit.siteParameter;

import javax.annotation.Resource;

import org.blue.junit.SpringTestRollBackBase;
import org.blue.sys.siteparameter.service.SiteParameterService;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;


public class SiteParameterServiceTest extends SpringTestRollBackBase {

	@Resource
	private SiteParameterService siteParameter;
	
	@Test
	public void siteParameterGetTest()
	{
		String smtp=siteParameter.getParamValue("smtp");
		assertNotNull(smtp);
		System.out.println(smtp);
	}
}
