package org.blue.webframework.sys.weixin.dao;

import org.blue.webframework.sys.weixin.model.AccessToken;

public interface AccessTokenMapper {
	    int deleteByPrimaryKey(Integer id);

	    int save(AccessToken record);

	    AccessToken selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(AccessToken record);

	    int updateByPrimaryKey(AccessToken record);
	    
	    /**
	     * 获取可以用的AccessToken
	     * @param appId
	     * @return
	     */
	    AccessToken selectUsefullToken(String appId);
	    
	    /**
	     * 让accesstoken马上过期
	     * @param appId
	     */
	    void letAccesstokenExpireByAppId(String appId);
	    
	    /**
	     * 删除旧的accesstpoken(7天以前)
	     */
	    void deleteOldAccesstoken();

		String getAppIdByAccessToken(String accessToken);
	}