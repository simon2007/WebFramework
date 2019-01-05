package org.blue.sys.weixin.utils;

import org.blue.sys.http.service.HttpService;
import org.blue.sys.weixin.dao.AccessTokenMapper;
import org.blue.sys.weixin.model.UserIdentification;
import org.blue.sys.weixin.utils.WeixinHelperManager.WeixinConfig;

public class WebWeixinHelper extends WeixinHelper {

	public WebWeixinHelper(HttpService httpService, AccessTokenMapper accessTokenMapper, WeixinConfig config) {
		super(httpService, accessTokenMapper, config);

	}


	public UserIdentification getUserIdentification(String code) {
		UserIdentification userId = super.getUserIdentification(code);
		// 保存用户的Token
		/*if (userId != null) {
			AccessToken token = new AccessToken();
			token.setAppId(userId.getOpenid());
			token.setToken(userId.getAccessToken());

			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.SECOND, userId.getExpiresIn() - 60);
			token.setExpirestime(cal.getTime());
			accesstokenCache.put(userId.getOpenid(), token);
			accessTokenMapper.save(token);
		}*/
		return userId;
	}

}
