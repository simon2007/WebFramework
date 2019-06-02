package org.blue.webframework.sys.weixin.dao;

import org.apache.ibatis.annotations.Param;

import org.blue.webframework.sys.weixin.model.WeixinUser;

public interface WeixinUserMapper {
	    int save(WeixinUser record);

	    void updateByAppIdOpenIdSelective(WeixinUser unionId);

	    WeixinUser selectByUnionIdAndAppId(@Param("appId")String appId,@Param("unionId")String unionId);
	    WeixinUser selectByOpenIdAndAppId(@Param("appId")String appId,@Param("openId")String openId);
		int dropTable();
		int truncateTable();
		int createTable();
	}