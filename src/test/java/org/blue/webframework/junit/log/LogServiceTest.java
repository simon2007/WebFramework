package org.blue.webframework.junit.log;

import java.util.Date;

import javax.annotation.Resource;

import org.blue.webframework.junit.SpringTestRollBackBase;
import org.blue.webframework.sys.log.model.Log;
import org.blue.webframework.sys.log.service.LogService;
import org.junit.Assert;
import org.junit.Test;

import com.github.pagehelper.Page;

public class LogServiceTest extends SpringTestRollBackBase {

	@Resource
	private LogService logService;
	
	@Test
	public void AddLogTest()
	{
		int accountId=1;
		String content="1234567890";
		logService.addLog(accountId,content);
		Page<Log> page= logService.getAccountLogList(accountId, 1, 20,null,null);

			Assert.assertFalse(page == null || page.getTotal()<=0);
			Log log=page.get(0);
			System.out.println("time="+log.getCreatetime());
			Assert.assertEquals(log.getAccountId(),accountId);
			Assert.assertEquals(log.getContent(),content);
			Assert.assertTrue(new Date().getTime()-log.getCreatetime().getTime() <1000);
	}

	@Test
	public void addLog(){

		StringBuilder builder = new StringBuilder();
		builder.append("we want you freebuf!，");
		builder.append("where are we going?，");
		builder.append("jack: you will jump,i will jump！，");
		builder.append("interesting");
		System.err.println(builder);

		logService.addLog(1,"佛曰：When I wrote this, only God and I understood what I was doing\n" +
				" Now, God only knows");
	}

}
