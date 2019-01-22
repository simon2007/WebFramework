package org.blue.webframework.exception;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.support.ResourceBundleMessageSource;

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

	private static ResourceBundleMessageSource messageSource;

	private static ResourceBundleMessageSource messageSource() {
		if (messageSource != null)
			return messageSource;
		messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages", "errorcode");
		messageSource.setDefaultEncoding("utf-8");

		return messageSource;
	}

	public static String getMsg(String code) {

		return messageSource().getMessage(code, null, "出错啦", Locale.getDefault());
	}

	private final String code;

	public BaseException(String code) {
		super(getMsg(code));
		this.code = code;
	}

	public BaseException(String code, Exception e) {
		super(getMsg(code), e);
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
