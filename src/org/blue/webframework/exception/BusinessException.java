package org.blue.webframework.exception;

/**
 * 业务异常,业务层的异常
 * @author Long
 *
 */
public class BusinessException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1805985407934333408L;

	/**
	 * 
	 * @param code
	 */
	public BusinessException(String code) {
		super(code);

	}

	/**
	 * 
	 * @param code
	 * @param e
	 */
	public BusinessException(String code,Exception e) {
		super(code,e);

	}
	
}
