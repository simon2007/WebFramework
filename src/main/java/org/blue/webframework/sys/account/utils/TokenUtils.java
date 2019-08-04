package org.blue.webframework.sys.account.utils;

import org.blue.webframework.sys.account.vo.AccountVo;
import org.blue.webframework.utils.JWTUtils;

import com.alibaba.fastjson.JSONObject;

public class TokenUtils {

	private final static String ACCOUNT_ID_KEY="id";
	private final static String ACCOUNT_NAME_KEY="name";
	private final static String ROLE_ID_KEY="rid";
	private final static String GROUP_ID_KEY="gid";


	/**
	 * @Title: getRoleIdFromToken
	 * @Description: 从toekn中获取RoleId
	 * @param: @param token
	 * @param: @return
	 * @return: String
	 * @throws
	 */
	public static Integer getRoleIdFromToken(String token) {
		JSONObject data = JWTUtils.getDataFromToken(token);
		if(data == null)return null;
		Integer userType = data.getInteger( ROLE_ID_KEY);
		return userType;
	}
	
	/**
	 * @Title: getRoleIdFromToken
	 * @Description: 从toekn中获取RoleId
	 * @param: @param token
	 * @param: @return
	 * @return: String
	 * @throws
	 */
	public static Integer getGroupIdFromToken(String token) {
		JSONObject data = JWTUtils.getDataFromToken(token);
		if(data == null)return null;
		Integer userType = data.getInteger( GROUP_ID_KEY);
		return userType;
	}

	/**
	 * @Title: getRoleIdFromToken
	 * @Description: 从toekn中获取RoleId
	 * @param: @param token
	 * @param: @return
	 * @return: String
	 * @throws
	 */
	public static String getNameFromToken(String token) {
		JSONObject data = JWTUtils.getDataFromToken(token);
		if(data == null)return null;
		String userType = data.getString(ACCOUNT_NAME_KEY);
		return userType;
	}
	
	/**
	 * @Title: getUserIdFromToken
	 * @Description: 从toekn中获取userId
	 * @param: @param token
	 * @param: @return
	 * @return: int
	 * @throws
	 */
	public static Integer getAccountIdFromToken(String token) {
		JSONObject data = JWTUtils.getDataFromToken(token);
		if(data == null)return null;
		Integer userType = data.getInteger( ACCOUNT_ID_KEY);
		return userType;
	}
	
	public static String getToken(AccountVo account)
	{
		JSONObject userInfo=new  JSONObject();
		userInfo.put(ACCOUNT_ID_KEY, account.getId());
		userInfo.put(ROLE_ID_KEY, account.getRoleId());
		userInfo.put(GROUP_ID_KEY, account.getGroupId());
		userInfo.put(ACCOUNT_NAME_KEY, account.getName());
		return JWTUtils.createTokenWithClaim(userInfo);
	}
}
