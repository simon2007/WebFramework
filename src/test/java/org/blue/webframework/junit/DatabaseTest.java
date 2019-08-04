package org.blue.webframework.junit;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.alibaba.druid.filter.config.ConfigTools;


@Rollback(false)
public class DatabaseTest  {

	@Test
	public void printPassword() throws Exception
	{
		String encodingPassword=ConfigTools.encrypt("root123");
		System.out.println("encodingPassword="+encodingPassword);
		System.out.println("encodingPassword="+ConfigTools.decrypt( encodingPassword));
	}
	
}
