package org.blue.webframework.sys.weixin.utils;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.blue.webframework.sys.http.service.HttpService;
import org.blue.webframework.sys.weixin.dao.AccessTokenMapper;
import org.blue.webframework.sys.weixin.model.AccessToken;
import org.blue.webframework.sys.weixin.utils.WeixinHelperManager.WeixinConfig;
import org.blue.webframework.sys.weixin.vo.WeixinButton;
import org.blue.webframework.utils.StringHelper;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;


/**
 * 公众号
 * 
 * @author Long
 *
 */
public class OfficialWeixinHelper extends WeixinHelper {

	private final Logger log = LogManager.getLogger(getClass());
	private final String ACCESSTOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=#{openid}&secret=#{appsecret}";

	public OfficialWeixinHelper(HttpService httpService, AccessTokenMapper accessTokenMapper, WeixinConfig config) {
		super(httpService, accessTokenMapper, config);
		USER_INFO = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=#{accessToken}&openid=#{openid}&lang=zh_CN";

	}

	public String getAccessToken(String openid) {
		String appId = getAppId();

		String accessToken = super.getAccessToken(appId);
		if (!StringHelper.isBlank(accessToken))
			return accessToken;
		try {
			String appSecret = getAppSecret();

			String url = ACCESSTOKEN_URL.replace("#{openid}", appId).replace("#{appsecret}", appSecret);
			String content = httpService.post(url);
			JSONObject jsonObject = JSONObject.parseObject(content);
			if (vaildResult(jsonObject, appId)) {
				// 保存用户的Token
				AccessToken token = new AccessToken();
				token.setAppId(appId);
				token.setToken(jsonObject.getString("access_token"));
				int expiresIn = jsonObject.getInteger("expires_in");

				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.SECOND, expiresIn - 300);
				token.setExpirestime(cal.getTime());
				accesstokenCache.put(appId, token);
				accessTokenMapper.save(token);
				return token.getToken();
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return null;

	}

	protected void removeAccesstoken(String appId) {
		super.removeAccesstoken(getAppId());
	}

	private final String TEMPLATEMESSAGEURL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=#{accessToken}";

	public void sendTemplateMessage(String openId, String id, String linkUrl, JSONObject obj) throws IOException {
		if (StringHelper.isBlank(openId) || StringHelper.isBlank(id))
			return;

		String weixinTpl = config.getTmpl(id);
		if (StringHelper.isBlank(weixinTpl)) {
			log.error("templ[" + id + "] no found");
			return;
		}
		String url = TEMPLATEMESSAGEURL.replace("#{accessToken}", getAccessToken(getAppId()));
		JSONObject param = new JSONObject();
		param.put("touser", openId);
		param.put("template_id", weixinTpl);
		param.put("url", linkUrl);
		param.put("topcolor", "#FF0000");
		param.put("data", obj);
		String result = httpService.post(url, param);
		log.info("result=" + result);
	}

	private final String SEND_CUSTOM_MESSAGE = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=#{accessToken}";

	/**
	 * 
	 * @param openId openId
	 * @param msgType 消息类型
	 *            text image voice music news wxcard
	 * @param content 消息内容
	 * @throws IOException 网络异常
	 */
	public void sendCustomMessage(String openId, String msgType, JSONObject content) throws IOException {
		if (StringHelper.isBlank(openId) || StringHelper.isBlank(msgType))
			return;
		String url = SEND_CUSTOM_MESSAGE.replace("#{accessToken}", getAccessToken(getAppId()));

		JSONObject param = new JSONObject();
		param.put("touser", openId);
		param.put("msgtype", msgType);
		param.put(msgType, content);

		String result = httpService.post(url, param);
		log.info("result=" + result);
	}

	private final String CREATEBUTTON = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=#{accessToken}";
	
	/**
	 * 创建自定义菜单
	 * @param buttons 自定义菜单
	 * @throws IOException 网络异常
	 */
	public void createButton(List<WeixinButton> buttons) throws IOException {
		JSONObject obj = new JSONObject();
		obj.put("button", buttons);
		log.info(obj);
		String url = CREATEBUTTON.replace("#{accessToken}", getAccessToken(getAppId()));
		String result = httpService.post(url, obj);
		log.info("result=" + result);
	}
	
	private final String DELETEBUTTON="https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=#{accessToken}";
	/**
	 * 删除自定义菜单
	 * @throws IOException 网络异常
	 */
	public void deleteButton() throws IOException
	{
		String url = DELETEBUTTON.replace("#{accessToken}", getAccessToken(getAppId()));
		String result = httpService.get(url);
		log.info("result=" + result);
	}
}
