package org.blue.webframework.sys.weixin.service.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.blue.webframework.sys.account.service.AccountService;
import org.blue.webframework.sys.http.service.HttpService;
import org.blue.webframework.sys.weixin.dao.AccessTokenMapper;
import org.blue.webframework.sys.weixin.dao.WeixinUserMapper;
import org.blue.webframework.sys.weixin.model.UserIdentification;
import org.blue.webframework.sys.weixin.model.WeixinUser;
import org.blue.webframework.sys.weixin.service.WeixinService;
import org.blue.webframework.sys.weixin.utils.OfficialWeixinHelper;
import org.blue.webframework.sys.weixin.utils.WebWeixinHelper;
import org.blue.webframework.sys.weixin.utils.WeixinHelper;
import org.blue.webframework.sys.weixin.utils.WeixinHelperManager;
import org.blue.webframework.sys.weixin.vo.UserIdentificationVo;
import org.blue.webframework.sys.weixin.vo.UserWeixinMessageVo;
import org.blue.webframework.sys.weixin.vo.WeixinButton;
import org.blue.webframework.sys.weixin.vo.WeixinMessageVo;
import org.blue.webframework.sys.weixin.vo.WeixinUserInfoVo;
import org.blue.webframework.utils.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.oscache.util.StringUtil;

@Service("WeixinService")
class WeixinServiceImpl implements WeixinService {
	private WeixinHelperManager weixinHelperManager;
	private final Logger logger = LogManager.getLogger(getClass());
	@Resource
	private HttpService httpService;

	@Resource
	private AccessTokenMapper accessTokenMapper;

	@Resource
	private WeixinUserMapper weixinUserMapper;
	
	@Resource
	private AccountService accountService;



	/**
	 * 获取参数
	 */
	@PostConstruct
	public void init() {
		weixinHelperManager = new WeixinHelperManager(httpService, accessTokenMapper);
	}

	@Autowired(required = false)
	private HttpServletRequest request;

	protected HttpServletRequest getRequest() {
		if (request == null) {
			ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
			if (attr == null)
				return null;
			return attr.getRequest();
		} else
			return request;

	}

	protected String getServerName() {
		String serverName = null;

		HttpServletRequest request = getRequest();
		if (request != null)
			return serverName = request.getServerName();

		if (!StringHelper.isBlank(serverName))
			return serverName;
		return weixinHelperManager.DEFAULT_SERVER_NAME;

	}

	@Override
	public UserIdentificationVo getUserIdentification(String code) {
		if (StringHelper.isBlank(code))
			return null;
		String serverName = getServerName();
		UserIdentificationVo vo = new UserIdentificationVo();
		OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);
		UserIdentification model = weixinHelper.getUserIdentification(code);
		if (model == null)
			return null;
		vo.setOpenid(model.getOpenid());
		vo.setUnionId(model.getUnionId());
		return vo;
	}

	@Override
	public String getAppId() {
		String serverName = getServerName();
		OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);
		return weixinHelper.getAppId();
	}

	@Override
	public UserIdentificationVo getWebUserIdentification(String code) {
		if (StringHelper.isBlank(code))
			return null;
		String serverName = getServerName();
		UserIdentificationVo vo = new UserIdentificationVo();

		WebWeixinHelper helper = weixinHelperManager.getWebWeixinHelper(serverName);
		UserIdentification model = helper.getUserIdentification(code);
		if (model == null)
			return null;

		vo.setOpenid(model.getOpenid());
		vo.setUnionId(model.getUnionId());
		return vo;
	}

	@Override
	public String getWebAppId() {
		String serverName = getServerName();
		WebWeixinHelper helper = weixinHelperManager.getWebWeixinHelper(serverName);
		return helper.getAppId();
	}

	protected void saveOrUpdateUser(WeixinHelper helper, WeixinUserInfoVo obj) {
		if (obj == null || StringHelper.isBlank(obj.getOpenId()))
			return;

		String appId = helper.getAppId();
		boolean needSave = false;
		WeixinUser user = weixinUserMapper.selectByOpenIdAndAppId(appId, obj.getOpenId());
		if (user == null) {
			user = new WeixinUser();
			needSave = true;
		}
		if (user.getUpdateTime() != null && new Date().getTime() - user.getUpdateTime().getTime() < 36000000)
			return;

		user.setAppId(appId);
		user.setCity(obj.getCity());
		user.setCountry(obj.getCountry());
		user.setHeadImgUrl(obj.getHeadimgurl());
		user.setNickname(obj.getNickname());
		user.setOpenId(obj.getOpenId());
		user.setProvince(obj.getProvince());
		user.setSex(obj.getSex());
		user.setUnionId(obj.getUnionid());
		user.setSubscribe(obj.getSubscribe());

		if (needSave)
			weixinUserMapper.save(user);
		else
			weixinUserMapper.updateByAppIdOpenIdSelective(user);
	}

	@Override
	public WeixinUserInfoVo getUserInfo(String openid) {
		String serverName = getServerName();
		OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);
		WeixinUserInfoVo user = weixinHelper.getUserInfo(openid);
		if (user != null)
			saveOrUpdateUser(weixinHelper, user);
		return user;
	}

	@Override
	public WeixinUserInfoVo getWebUserInfo(String openid) {
		String serverName = getServerName();
		WebWeixinHelper helper = weixinHelperManager.getWebWeixinHelper(serverName);
		WeixinUserInfoVo user = helper.getUserInfo(openid);
		if (user != null)
			saveOrUpdateUser(helper, user);
		return user;
	}

	@Override
	public String getUserIdInWeixin(String code) {
		UserIdentificationVo vo = getUserIdentification(code);
		if (vo != null) {
			String id = vo.getUnionId();
			if (StringHelper.isNullOrEmpty(id) && !StringHelper.isNullOrEmpty(vo.getOpenid())) {
				WeixinUserInfoVo info = getUserInfo(vo.getOpenid());
				if (info != null)
					id = info.getUnionid();
			}
			if (StringUtil.isEmpty(id))
				id = vo.getOpenid();
			return id;
		}

		return "";
	}

	@Override
	public void sendTemplateMessageByUnionId(String unionId, String tempId, JSONObject obj) {
		String serverName = getServerName();
		try {
			OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);

			WeixinUser user = weixinUserMapper.selectByUnionIdAndAppId(weixinHelper.getAppId(), unionId);
			if (user == null || StringHelper.isBlank(user.getOpenId())) {
				logger.debug("没有找到对应的openid");
				return;
			}

			if (user.getSubscribe() == 0) {// 没有关注,怎么发送
				logger.debug("没有关注公众号");
				// 可以发送，1.没关注的情况，微信那边会判断 2.我们记录没关注，但是实际又关注了。
				// return;
			}
			// 微信中点击跳转的地址
			String linkUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + weixinHelper.getAppId() + "&redirect_uri=https%3a%2f%2f" + serverName + "%2fstatic%2fvueWeixin%2fweixinVueHomeJsp&response_type=code&scope=snsapi_base&state=null,null#wechat_redirect";
			weixinHelper.sendTemplateMessage(user.getOpenId(), tempId, linkUrl, obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getRedirectUri(String redirectUri, String state) {
		try {
			StringBuffer sb = new StringBuffer("https://open.weixin.qq.com/connect/oauth2/authorize?appid=");
			sb.append(getAppId());
			sb.append("&redirect_uri=").append(URLEncoder.encode(redirectUri, "UTF-8"));
			sb.append("&response_type=code&scope=snsapi_base&state=").append(URLEncoder.encode(state, "UTF-8"));
			sb.append("&connect_redirect=1#wechat_redirect");
			return sb.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "/";
	}

	/**
	 * 打印微信发来的消息
	 * 
	 * @param inMsg
	 */
	protected void printMessage(UserWeixinMessageVo inMsg) {
		StringBuffer sb = new StringBuffer();
		sb.append("MsgId=" + inMsg.getMsgId()).append("\r\n");
		sb.append("CreateTime=" + inMsg.getCreateTime()).append("\r\n");
		sb.append("FromUserName=" + inMsg.getFromUserName()).append("\r\n");
		sb.append("ToUserName=" + inMsg.getToUserName()).append("\r\n");

		if ("text".equalsIgnoreCase(inMsg.getMsgType()))
			sb.append("Content=" + inMsg.getContent()).append("\r\n");
		else if ("image".equalsIgnoreCase(inMsg.getMsgType())) {
			sb.append("picurl=" + inMsg.getPicUrl()).append("\r\n");
			sb.append("mediaId=" + inMsg.getMediaId()).append("\r\n");
		} else if ("voice".equalsIgnoreCase(inMsg.getMsgType())) {
			sb.append("format=" + inMsg.getFormat()).append("\r\n");
			sb.append("mediaId=" + inMsg.getMediaId()).append("\r\n");
			sb.append("Recognition=" + inMsg.getRecognition()).append("\r\n");
		} else if ("video".equalsIgnoreCase(inMsg.getMsgType())) {
			sb.append("ThumbMediaId=" + inMsg.getThumbMediaId()).append("\r\n");
			sb.append("mediaId=" + inMsg.getMediaId()).append("\r\n");
		} else if ("location".equalsIgnoreCase(inMsg.getMsgType())) {
			sb.append("locationx=" + inMsg.getLocationX()).append("\r\n");
			sb.append("locationy=" + inMsg.getLocationY()).append("\r\n");
			sb.append("scale=" + inMsg.getScale()).append("\r\n");
			sb.append("label=" + inMsg.getLabel()).append("\r\n");
		} else if ("link".equalsIgnoreCase(inMsg.getMsgType())) {
			sb.append("title=" + inMsg.getTitle()).append("\r\n");
			sb.append("description=" + inMsg.getDescription()).append("\r\n");
			sb.append("url=" + inMsg.getUrl()).append("\r\n");
		} else if ("event".equalsIgnoreCase(inMsg.getMsgType())) {
			if ("subscribe".equalsIgnoreCase(inMsg.getEvent())) {
				sb.append("事件:关注").append("\r\n");
			} else if ("unsubscribe".equalsIgnoreCase(inMsg.getEvent())) {
				sb.append("事件:取消关注").append("\r\n");
			} else if ("LOCATION".equalsIgnoreCase(inMsg.getEvent())) {
				sb.append("纬度:" + inMsg.getLatitude()).append("\r\n");
				sb.append("经度:" + inMsg.getLongitude()).append("\r\n");
				sb.append("精度:" + inMsg.getPrecision()).append("\r\n");
			}

		}
		logger.debug(sb.toString());
	}



	@Override
	public String getAccessToken() {
		String serverName = getServerName();
		OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);
		return weixinHelper.getAccessToken(weixinHelper.getAppId());
	}

	/**
	 * 发送客服消息
	 */
	@Override
	public void sendCustomMessage(String openId, String msgtype, JSONObject content) {
		try {
			String serverName = getServerName();
			OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);
			weixinHelper.sendCustomMessage(openId, msgtype, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 发送客服消息
	 */
	@Override
	public void sendCustomMessageByCustId(int userId, String msgtype, JSONObject content) {
		try {

			String serverName = getServerName();
			OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);

			String unionId = accountService.getOpenIdById(userId);
			if (!StringHelper.isBlank(unionId)) {
				WeixinUser weixinUser = weixinUserMapper.selectByUnionIdAndAppId(weixinHelper.getAppId(), unionId);
				if (weixinUser != null)
					unionId = weixinUser.getOpenId();
			}

			weixinHelper.sendCustomMessage(unionId, msgtype, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getAccessToken(String appid, String secret) {
		OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelperByAppId(appid);
		if (!weixinHelper.getAppSecret().equals(secret)) {
			logger.debug("appid=" + appid + " secret=" + secret + " orinsecret=" + weixinHelper.getAppSecret());
			return null;
		}
		return weixinHelper.getAccessToken(appid);

	}

	@Override
	public void sendCustomMessageByUserId(String accessToken, int userId, String msgtype, JSONObject content) {
		try {

			String appId = accessTokenMapper.getAppIdByAccessToken(accessToken);
String openid="";
			if (StringHelper.isBlank(appId))
				return;
			OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelperByAppId(appId);

			String unionId = accountService.getOpenIdById(userId);

			WeixinUser weixinUser = weixinUserMapper.selectByUnionIdAndAppId(weixinHelper.getAppId(), unionId);
			if (weixinUser != null)
				openid = weixinUser.getOpenId();

			weixinHelper.sendCustomMessage(openid, msgtype, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteOldAccessToken() {
		// 删除7天以前的sccesstoken
		accessTokenMapper.deleteOldAccesstoken();
	}

	@Override
	public void createOfficialButtons(List<WeixinButton> buttons) {
		try {
			String serverName = getServerName();
			OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);
			weixinHelper.createButton(buttons);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOfficialButtons() {
		try {
			String serverName = getServerName();
			OfficialWeixinHelper weixinHelper = weixinHelperManager.getOfficialWeixinHelper(serverName);
			weixinHelper.deleteButton();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public WeixinMessageVo recvMessage(String openId, UserWeixinMessageVo inMsg) {

		return null;
	}


}
