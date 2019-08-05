package org.blue.webframework.junit.account;

import org.blue.webframework.sys.account.utils.Argon2Utils;
import org.junit.Assert;
import org.junit.Test;

public class Argon2UtilsTest {

	@Test
	public void passwordTest() {
		String password = "123456";
		String tmp = Argon2Utils.encode(password);
		System.out.println(tmp);
		Assert.assertTrue(Argon2Utils.verify(password, tmp));

	}
}
