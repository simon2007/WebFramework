package org.blue.webframework.exception;


/**
 * 界面异常,界面层的异常
 * 
 * @author Long
 *
 */
public class UIException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1805985407934333409L;

	private String view;

	/**
	 * 
	 * @param code
	 */
	public UIException(String code) {
		super(code);

	}
	
	/**
	 * 
	 * @param code
	 * @param view
	 * @param e
	 */
	public UIException(String code, String view, Exception e) {
		super(code, e);
		this.view = view;
	}

	/**
	 * 跳转的页面
	 * @return
	 */
	public String getView() {
		return view;
	}

}
