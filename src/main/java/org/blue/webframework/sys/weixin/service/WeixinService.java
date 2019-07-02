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
 * @author Lilongwu
 *
 */
public interface WeixinService {
	/**
	 * 微信公众号，获取用户的openid
	 * 
	 * @param code 微信传过来的code
	 * @return 用户信息
	 */
	UserIdentificationVo getUserIdentification(String code);

	/**
	 * 获取公众号的AppId
	 * 
	 * @return AppId
	 */
	String getAppId();

	/**
	 * 获取公众号用户资料
	 * 
	 * @param openid 用户的openid
	 * @return
	 */
	WeixinUserInfoVo getUserInfo(String openid);

	/**
	 * 获取公众号用户的id，如果有unionid返回unionid，没有则返回openid，获取不到返回空串
	 * 
	 * @param code 微信传过来的code
	 * @return unionid
	 */
	String getUserIdInWeixin(String code);

	/**
	 * 获取网站的AppId
	 * 
	 * @return 网站的AppId
	 */
	String getWebAppId();

	/**
	 * 扫码登录 获取用户的openid
	 * 
	 * @param code 微信传过来的code
	 * @return 用户信息
	 */
	UserIdentificationVo getWebUserIdentification(String code);

	/**
	 * 获取用户资料
	 * 
	 * @param openid 用户的openid
	 * @return 用户信息
	 */
	WeixinUserInfoVo getWebUserInfo(String openid);

	/**
	  *   通过公众号给用户发送消息
	 * 
	 * @param unionId 用户的openid
	 * @param tempId 模板id
	 * @param obj 参数
	 */
	void sendTemplateMessageByUnionId(String unionId, String tempId, JSONObject obj);

	/**
	 * 获取认证地址（获取code的地址）
	 * 
	 * @param redUrl 要跳转的地址
	 * @param state 状态
	 * @return 认证地址
	 */
	String getRedirectUri(String redirectUri, String state);

	/**
	 * 回复微信公众号信息
	 * @param openId 用户的openid
	 * @param inMsg 消息
	 * @return 用户信息
	 */
	WeixinMessageVo recvMessage(String openId, UserWeixinMessageVo inMsg);
	
	/**
	 * 
	 * @return 获取accessToken
	 */
	String getAccessToken();
	
	/**
	 * 发送客服消息
	 * @param openId 用户的openId
	 * @param msgtype 消息类型
	 * @param content 消息内容
	 */
	void sendCustomMessage(String openId,String msgtype,JSONObject content);
	
	/**
	 * 发送客服消息
	 * @param userId 用户的id
	 * @param msgtype 消息类型
	 * @param content 消息内容
	 */
	void sendCustomMessageByCustId(int userId,String msgtype,JSONObject content);

	/**
	 * @param appid appId
	 * @param secret secret
	 * @return 返回accessToken
	 */
	String getAccessToken(String appid, String secret);

	/**
	 * 
	 * @param accessToken accessToken
	 * @param userId 用户的id
	 * @param msgtype 消息类型
	 * @param msg 消息
	 */
	void sendCustomMessageByUserId(String accessToken, int userId, String msgtype, JSONObject msg);
	
	/**
	 * 删除过期的token
	 */
	void deleteOldAccessToken();
	
	/**
	 * 创建自定义按键
	 * @param buttons 自定义按键
	 */
	void createOfficialButtons(List<WeixinButton> buttons);
	
	/**
	 * 删除自定义菜单
	 */
	void deleteOfficialButtons();
}
