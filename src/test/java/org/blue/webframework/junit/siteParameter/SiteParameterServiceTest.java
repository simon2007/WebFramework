package org.blue.webframework.junit.siteParameter;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestRollBackBase;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;
import org.blue.webframework.sys.siteparameter.vo.SiteParameterVo;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;


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
