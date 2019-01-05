package org.blue.webframework.sys.weixin.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import org.blue.webframework.sys.weixin.vo.UserIdentificationVo;
import org.blue.webframework.sys.weixin.vo.UserWeixinMessageVo;
import org.blue.webframework.sys.weixin.vo.WeixinButton;
import org.blue.webframework.sys.weixin.vo.WeixinMessageVo;
import org.blue.webframework.sys.weixin.vo.WeixinUserInfoVo;

/**
 * 微信服务
 * 
 * @author Long
 *
 */
public interface WeixinService {
	/**
	 * 微信公众号，获取用户的openid
	 * 
	 * @param code
	 * @param serverName
	 * @return
	 */
	UserIdentificationVo getUserIdentification(String code);

	/**
	 * 获取公众号的AppId
	 * 
	 * @param serverName
	 * @return
	 */
	String getAppId();

	/**
	 * 获取公众号用户资料
	 * 
	 * @param openid
	 * @param serverName
	 * @return
	 */
	WeixinUserInfoVo getUserInfo(String openid);

	/**
	 * 获取公众号用户的id，如果有unionid返回unionid，没有则返回openid，获取不到返回空串
	 * 
	 * @param code
	 * @param serverName
	 * @return
	 */
	String getUserIdInWeixin(String code);

	/**
	 * 获取网站的AppId
	 * 
	 * @return
	 */
	String getWebAppId();

	/**
	 * 扫码登录 获取用户的openid
	 * 
	 * @param code
	 * @return
	 */
	UserIdentificationVo getWebUserIdentification(String code);

	/**
	 * 获取用户资料
	 * 
	 * @param openid
	 * @return
	 */
	WeixinUserInfoVo getWebUserInfo(String openid);

	/**
	 * 发送消息
	 * 
	 * @param unionId
	 * @param id
	 * @param obj
	 */
	void sendTemplateMessageByUnionId(String unionId, String id, JSONObject obj);

	/**
	 * 获取认证地址（获取code的地址）
	 * 
	 * @param redUrl
	 * @param state
	 * @return
	 */
	String getRedirectUri(String redirectUri, String state);

	/**
	 * 回复微信公众号信息
	 * @param openId
	 * @param inMsg
	 * @return
	 */
	WeixinMessageVo recvMessage(String openId, UserWeixinMessageVo inMsg);
	
	/**
	 * 
	 * @return
	 */
	String getAccessToken();
	
	/**
	 * 发送客服消息
	 * @param openId
	 * @param msgtype
	 * @param content
	 */
	void sendCustomMessage(String openId,String msgtype,JSONObject content);
	
	/**
	 * 发送客服消息
	 * @param custId
	 * @param msgtype
	 * @param content
	 */
	void sendCustomMessageByCustId(long userId,String msgtype,JSONObject content);

	/**
	 * @param appid
	 * @param secret
	 * @return
	 */
	String getAccessToken(String appid, String secret);

	/**
	 * 
	 * @param accessToken
	 * @param openId
	 * @param msgtype
	 * @param msg
	 */
	void sendCustomMessageByUserId(String accessToken, long userId, String msgtype, JSONObject msg);
	
	/**
	 * 删除过期的token
	 */
	void deleteOldAccessToken();
	
	/**
	 * 创建自定义按键
	 * @param buttons
	 */
	void createOfficialButtons(List<WeixinButton> buttons);
	
	/**
	 * 删除自定义菜单
	 */
	void deleteOfficialButtons();
}
