package org.blue.sys.weixin.utils;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.blue.sys.http.service.HttpService;
import org.blue.sys.weixin.dao.AccessTokenMapper;
import org.blue.sys.weixin.model.AccessToken;
import org.blue.sys.weixin.model.UserIdentification;
import org.blue.sys.weixin.utils.WeixinHelperManager.WeixinConfig;
import org.blue.sys.weixin.vo.WeixinUserInfoVo;
import org.blue.utils.StringHelper;

import com.alibaba.fastjson.JSONObject;

public abstract class WeixinHelper {

	protected final Log log;

	protected static class AccessTokenExpiredException extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = -4537194116158699803L;

	}

	protected final HttpService httpService;
	protected final AccessTokenMapper accessTokenMapper;

	protected final ConcurrentHashMap<String, AccessToken> accesstokenCache = new ConcurrentHashMap<String, AccessToken>();

	protected final WeixinConfig config;

	public WeixinHelper(HttpService httpService, AccessTokenMapper accessTokenMapper, WeixinConfig config) {
		log = LogFactory.getLog(getClass());
		this.httpService = httpService;
		this.accessTokenMapper = accessTokenMapper;
		this.config = config;
	}

	public String getAppId() {
		return config.getAppId();
	}

	public String getAppSecret() {
		return config.getAppSecret();
	}

	// 获取openid
	private final String GET_OPENID_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=#{appid}&secret=#{secret}&code=#{code}&grant_type=authorization_code";

	// 获取用户信息
	protected String USER_INFO = "https://api.weixin.qq.com/sns/userinfo?access_token=#{accessToken}&openid=#{openid}&lang=zh_CN";

	/**
	 * 获取用户的openid，unionId
	 * 
	 * @param code
	 * @return
	 */
	public UserIdentification getUserIdentification(String code) {
		String appId = getAppId();
		String appSecret = getAppSecret();
		String url = GET_OPENID_URL.replace("#{appid}", appId).replace("#{secret}", appSecret).replace("#{code}", code);

		try {
			String content = httpService.post(url);
			JSONObject jsonObject = JSONObject.parseObject(content);
			if (vaildResult(jsonObject, appId)) {
				UserIdentification userId = new UserIdentification();
				userId.setOpenid(jsonObject.getString("openid"));
				if (jsonObject.containsKey("unionid"))
					userId.setUnionId(jsonObject.getString("unionid"));
				userId.setAccessToken(jsonObject.getString("access_token"));
				userId.setRefreshToken(jsonObject.getString("refresh_token"));
				userId.setScope(jsonObject.getString("scope"));
				userId.setExpiresIn(jsonObject.getInteger("expires_in"));

				return userId;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Object getOrDefault(JSONObject obj, String key, Object defaultValue) {
		if (obj.containsKey(key))
			return obj.get(key);
		return defaultValue;
	}

	/**
	 * 检验微信返回结果
	 * 
	 * @param obj
	 * @param appid
	 * @return
	 */
	protected boolean vaildResult(JSONObject obj, String appid) {
		if (obj == null)
			return false;
		String errcode = getOrDefault(obj, "errcode", "").toString();
		if (!StringHelper.isBlank(errcode)) {
			if ("40001".equals(errcode)) {// accesstoken过期
				removeAccesstoken(appid);
				throw new AccessTokenExpiredException();
			} else if ("40029".equals(errcode)) {// code无效或者code过期

			} else if ("40003".equals(errcode)) {
				// openid有问题
			}
			if (log.isErrorEnabled()) {
				String errmsg = getOrDefault(obj, "errmsg", "").toString();
				log.error("errcode=" + errcode + " errmsg=" + errmsg);
			}

			return false;
		}
		return true;
	}

	/**
	 * 获取用户的基本信息，已判断有木有关注公众号
	 * 
	 * @param accessToken
	 * @param openid
	 * @return
	 * @throws IOException
	 */
	protected WeixinUserInfoVo getUserInfo(String openid, String accessToken) throws IOException {
		if (StringHelper.isBlank(accessToken) || StringHelper.isBlank(openid))
			return null;
		String url = USER_INFO.replace("#{accessToken}", accessToken).replace("#{openid}", openid);

			String content = httpService.post(url);
			JSONObject obj = JSONObject.parseObject(content);
			if (!vaildResult(obj, openid)) {
				if (log.isErrorEnabled())
					log.error("getUserInfo error openid=" + openid);
				return null;
			}

			WeixinUserInfoVo userInfo = new WeixinUserInfoVo();
			userInfo.setCity(obj.getString("city"));
			userInfo.setCountry(obj.getString("country"));
			userInfo.setHeadimgurl(obj.getString("headimgurl"));
			userInfo.setNickname(obj.getString("nickname"));
			userInfo.setSex(obj.getIntValue("sex"));
			userInfo.setSubscribe(obj.getIntValue("subscribe"));
			userInfo.setUnionid(obj.getString("unionid"));
			
			userInfo.setOpenId(openid);
			return userInfo;


	}

	/**
	 * 获取accesstoken
	 * 
	 * @param openid
	 * @return
	 */
	public String getAccessToken(String openid) {
		AccessToken token = null;
		if (accesstokenCache.containsKey(openid))
			token = accesstokenCache.get(openid);
		if (token == null) {
			token = accessTokenMapper.selectUsefullToken(openid);
			if (token != null)
				accesstokenCache.put(openid, token);
		}
		if (token != null) {
			Date expirestime = token.getExpirestime();
			if (expirestime == null || expirestime.before(new Date())) {
				accesstokenCache.remove(openid);
				token = null;
			}
		}

		if (token != null)
			return token.getToken();

		return null;
	}
	
	/**
	 * 获取用户的信息
	 * 
	 * @param openid
	 * @return
	 */
	public WeixinUserInfoVo getUserInfo(String openid) {
		// 重试3次，有可能因为网络问题，或者accesstoken过期而导致重试
		for (int i = 0; i < 3; i++) {
			try {
				String token = getAccessToken(openid);
				if (StringHelper.isBlank(token))
					return null;
				return getUserInfo(openid, token);
			} catch (AccessTokenExpiredException e) {

			} catch (IOException e) {
				break;
			}
		}
		return null;
	}

	/**
	 * 这个accesstoken已经无效了，移除掉
	 * 
	 * @param appId
	 */
	protected void removeAccesstoken(String appId) {
		accessTokenMapper.letAccesstokenExpireByAppId(appId);
		accesstokenCache.remove(appId);
	}
}
