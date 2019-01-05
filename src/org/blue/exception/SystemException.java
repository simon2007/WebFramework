package org.blue.exception;

/**
 * 系统异常，接收到这个异常说明有bug
 * @author Long
 *
 */
public class SystemException extends BaseException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1140620468823843379L;

	public SystemException(String code) {
		super(code);
	}

	public SystemException(String code, Exception e) {
		super(code,e);
	}

}
