package org.blue.webframework.utils;

import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 字符串帮助类
 * 
 * @author Lilongwu
 *
 */
public final class StringHelper {
	public static boolean isNullOrEmpty(CharSequence text) {
		return text == null || text.length() <= 0;
	}

	/**
	 * <p>
	 * Checks if a CharSequence is whitespace, empty ("") or null.
	 * </p>
	 * 
	 * <pre>
	 * StringUtils.isBlank(null)      = true
	 * StringUtils.isBlank(&quot;&quot;)        = true
	 * StringUtils.isBlank(&quot; &quot;)       = true
	 * StringUtils.isBlank(&quot;bob&quot;)     = false
	 * StringUtils.isBlank(&quot;  bob  &quot;) = false
	 * </pre>
	 * 
	 * @param cs the CharSequence to check, may be null
	 * @return {@code true} if the CharSequence is null, empty or whitespace
	 * @since 2.0
	 * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)
	 */
	public static boolean isBlank(CharSequence cs) {
		if (isNullOrEmpty(cs)) {
			return true;
		}

		return isNullOrEmpty(cs.toString().trim());
	}

	/**
	 * 强制转换
	 * 
	 * @param value 要转换的值
	 * @return 转换后的值
	 */
	public static Long longParse(String value) {
		try {
			if (!isLong(value))
				return 0l;
			return Long.parseLong(value);
		} catch (Exception e) {
			return (long) 0;
		}
	}

	/**
	 * 强制转换
	 * 
	 * @param value 要转换的值
	 * @return 转换后的值
	 */
	public static int intParse(String value) {
		try {
			if (value == null) {
				return 0;
			}
			return Integer.parseInt(value);
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * 是不是long类型
	 * 
	 * @param num 数值
	 * @return 是否为long值
	 */
	public static boolean isLong(String num) {
		if (isBlank(num))
			return false;
		if (num.length() > 19)
			return false;
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
		return pattern.matcher(num).matches();

	}

	/**
	 * MD5加码 生成32位md5码
	 * 
	 * @param inStr 要生成的内容
	 * @return md5码
	 */
	public static String string2MD5(String inStr) {
		if(inStr==null)
			return "";
		StringBuffer md5str = null;
		try {
			// 1 创建一个提供信息摘要算法的对象，初始化为md5算法对象
			MessageDigest md = MessageDigest.getInstance("MD5");

			// 2 将消息变成byte数组, *一定要设置utf-8
			byte[] input = inStr.getBytes("utf-8");

			// 3 计算后获得字节数组,这就是那128位了
			byte[] buff = md.digest(input);

			// 4 把数组每一字节（一个字节占八位）换成16进制连成md5字符串
			md5str = bytesToHex(buff);

			return md5str.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 二进制转十六进制
	 * 
	 * @param bytes 要转换的值
	 * @return 十六进制
	 */
	private static StringBuffer bytesToHex(byte[] bytes) {
		StringBuffer md5str = new StringBuffer();
		// 把数组每一字节换成16进制连成md5字符串
		int digital;
		for (int i = 0; i < bytes.length; i++) {
			digital = bytes[i];

			if (digital < 0) {
				digital += 256;
			}
			if (digital < 16) {
				md5str.append("0");
			}
			md5str.append(Integer.toHexString(digital));
		}
		return md5str;
	}

	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 将日期转换为日期类型
	 * @param date 日期
	 * @return 格式化好的日期类型
	 */
	public static String toString(Date date) {

		return sdf.format(date);
	}

	public static Date parseDate(String dateString) throws ParseException {
		return sdf.parse(dateString);
	}
}
