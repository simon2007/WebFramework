package org.blue.webframework.sys.weixin.model;

import java.io.Serializable;
import java.util.Date;


public class WeixinUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 411917974370472166L;

	/**
	 * 用户的唯一标识
	 */
	private String openId;

	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String appId;
	
	/**
	 * 用户昵称
	 */
	private String nickName;
	/**
	 * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	 */
	private int sex;
	/**
	 * 用户个人资料填写的省份
	 */
	private String province;
	/**
	 * 普通用户个人资料填写的城市
	 */
	private String city;
	/**
	 * 国家，如中国为CN
	 */
	private String country;
	/**
	 * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。
	 * 若用户更换头像，原有头像URL将失效。
	 */
	private String headImgUrl;


	/**
	 * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。详见：获取用户个人信息（UnionID机制）
	 */
	private String unionId;

	/**
	 * 是否已经关注微信号 
	 */
	private int subscribe;
	
	
	private Date updateTime;
	
	public Date getUpdateTime()
	{
		return updateTime;
	}

	public void setupdateTime(Date updateTime){
		this.updateTime=updateTime;
	}
	
	public int getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(int subscribe) {
		this.subscribe = subscribe;
	}
	
	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickname(String nickName) {
		this.nickName = nickName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headimgurl) {
		this.headImgUrl = headimgurl;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionid) {
		this.unionId = unionid;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
}
