package org.blue.exception;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.util.ResourceUtils;

/**
 * 异常的基类
 * 
 * @author Long
 *
 */
public abstract class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2434707176688774880L;
	private final Map<String, Object> details = new HashMap<String, Object>();

	private static Properties errProperty = new Properties();

	static {
		FileInputStream fis = null;
		try {
			File file = ResourceUtils.getFile("classpath:errorcode.properties");
			if (file.exists()) {
				fis = new FileInputStream(file);
				errProperty.load(fis);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (Exception e) {

			}
		}
	}

	public static String getMsg(String code) {
		if (errProperty.containsKey(code))
			return errProperty.getProperty(code);

		return "出错了";
	}

	private final String code;

	public BaseException(String code) {
		super( getMsg(code));
		this.code=code;
	}

	public BaseException(String code, Exception e) {
		super( getMsg(code), e);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	/**
	 * 获取附带数据
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public Object getValue(String key, Object defaultValue) {
		if (details.containsKey(key))
			return details.get(key);
		return defaultValue;
	}

	/**
	 * 获取附带数据
	 * 
	 * @param key
	 * @return
	 */
	public Object getValue(String key) {
		return getValue(key, null);
	}

	/**
	 * 设置附带数据
	 * 
	 * @param key
	 * @param value
	 */
	public void setValue(String key, Object value) {
		details.put(key, value);
	}

	public Map<String, Object> getDetails() {
		return details;
	}
}
