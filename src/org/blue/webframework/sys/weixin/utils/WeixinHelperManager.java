package org.blue.webframework.sys.weixin.utils;

import java.util.Map;
import java.util.TreeMap;

import org.blue.webframework.sys.http.service.HttpService;
import org.blue.webframework.sys.weixin.dao.AccessTokenMapper;

/**
 * 多微信管理
 * 
 * @author Long
 *
 */
public class WeixinHelperManager {
	public final String DEFAULT_SERVER_NAME = "zhaoxie.net";

	
	private final TreeMap<String, OfficialWeixinHelper> officialWeixinHelpers = new TreeMap<String, OfficialWeixinHelper>();
	private final TreeMap<String, OfficialWeixinHelper> idofficialWeixinHelpers = new TreeMap<String, OfficialWeixinHelper>();
	private final TreeMap<String, OfficialWeixinHelper> appIdofficialWeixinHelpers = new TreeMap<String, OfficialWeixinHelper>();
	
	
	private final TreeMap<String, WebWeixinHelper> webWeixinHelpers = new TreeMap<String, WebWeixinHelper>();

	public WeixinHelperManager(HttpService httpService, AccessTokenMapper accessTokenMapper) {
		
	}

	public static class WeixinConfig {
		private String id,appId, appSecret, serverName;
		private Map<String, String> tmplMap = new TreeMap<String, String>();

		public String getId() {
			return id;
		}

		public String getAppId() {
			return appId;
		}

		public String getAppSecret() {
			return appSecret;
		}

		public String getServerName() {
			return serverName;
		}

		public String getTmpl(String id) {
			if (tmplMap.containsKey(id))
				return tmplMap.get(id);
			return null;
		}
	}


	/**
	 * 根据原始id查找
	 * @param id
	 * @return
	 */
	public OfficialWeixinHelper getOfficialWeixinHelperById(String id) {

		if (idofficialWeixinHelpers.containsKey(id))
			return idofficialWeixinHelpers.get(id);
		return officialWeixinHelpers.get(DEFAULT_SERVER_NAME);
	}
	
	/**
	 * 根据域名查找
	 * @param serverName
	 * @return
	 */
	public OfficialWeixinHelper getOfficialWeixinHelper(String serverName) {
		if (officialWeixinHelpers.containsKey(serverName))
			return officialWeixinHelpers.get(serverName);
		return officialWeixinHelpers.get(DEFAULT_SERVER_NAME);
	}

	/**
	 * 根据域名查找
	 * @param serverName
	 * @return
	 */
	public WebWeixinHelper getWebWeixinHelper(String serverName) {
		if (webWeixinHelpers.containsKey(serverName))
			return webWeixinHelpers.get(serverName);
		return webWeixinHelpers.get(DEFAULT_SERVER_NAME);
	}

	public OfficialWeixinHelper getOfficialWeixinHelperByAppId(String appId) {
		if (appIdofficialWeixinHelpers.containsKey(appId))
			return appIdofficialWeixinHelpers.get(appId);
		return officialWeixinHelpers.get(DEFAULT_SERVER_NAME);
	}
}
