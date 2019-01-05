package org.blue.sys.identifyingcode.service;



/**
 * 验证码服务，包括短信验证码，email验证码
 * @author Long
 *
 */
public interface IdentifyingCodeService {


	/**
	 * 发送验证码
	 * @param phone   手机号
	 * @return
	 * @throws ApiException 
	 */
	void sendSms(String phone,String templetId);
	
	/**
	 * 发送验证码
	 * @param email   email
	 * @return
	 * @throws ApiException 
	 */
	void sendEmail(String email,String templetId);
	
	/**
	 * 验证验证码
	 * @param phoneOrEmail
	 * @param code
	 * @param type
	 * @return
	 * @throws BusinessException
	 */
	boolean vaildCode(String phoneOrEmail,String code);
	

	int createTable();
}
