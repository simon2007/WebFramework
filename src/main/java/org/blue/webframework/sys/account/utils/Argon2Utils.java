package org.blue.webframework.sys.account.utils;

import java.nio.charset.StandardCharsets;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
/**
   *  密码检验
 * @author Administrator
 *
 */
public class Argon2Utils {
	public static String encode(String text) {
		Argon2 argon2 = Argon2Factory.create();

		try {
			return argon2.hash(5, 65536, 2, text, StandardCharsets.UTF_8);
		} finally {
			argon2.wipeArray(text.toCharArray());
		}
	}

	public static boolean verify(String text, String encode_text) {
		Argon2 argon2 = Argon2Factory.create();
		try {
			return argon2.verify(encode_text, text, StandardCharsets.UTF_8);
		} finally {
			argon2.wipeArray(text.toCharArray());
		}
	}
}
