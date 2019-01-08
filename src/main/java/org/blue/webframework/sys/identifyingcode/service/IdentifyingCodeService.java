package org.blue.webframework.sys.identifyingcode.service;



/**
 * 验证码服务，包括短信验证码，email验证码
 * @author Long
 *
 */
public interface IdentifyingCodeService {


	/**
	 * 发送验证码
	 * @param phone   手机号
	 * @param templetId 模板的id
	 */
	void sendSms(String phone,String templetId);
	
	/**
	 * 发送验证码
	 * @param email   email
	 * @param templetId 模板id
	 */
	void sendEmail(String email,String templetId);
	
	/**
	 * 验证验证码
	 * @param phoneOrEmail 手机或者邮箱
	 * @param code 校验码
	 * @return 是否校验通过
	 */
	boolean vaildCode(String phoneOrEmail,String code);
	

	int recreateTable();
}
