package org.blue.webframework.sys.weixin.vo;



public class WeixinUserInfoVo  {

	/**
	 * 用户的唯一标识
	 */
	private String openId;

	/**
	 * 用户昵称
	 */
	private String nickname;
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
	private String headimgurl;
	
	private String[] tagid_list;
	/**
	 * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
	 */
	private String[] privilege;
	/**
	 * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。详见：获取用户个人信息（UnionID机制）
	 */
	private String unionid;

	/**
	 * 是否已经关注微信号 
	 */
	private int subscribe;
	

	public int getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(int subscribe) {
		this.subscribe = subscribe;
	}
	
	/**
	 * 用户的唯一标识
	 * @return
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * 用户的唯一标识
	 * @param openId
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * 用户昵称
	 * @return
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * 用户昵称
	 * @param nickName
	 */
	public void setNickname(String nickName) {
		this.nickname = nickName;
	}

	/**
	 * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	 * @return
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	 * @param sex
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * 用户个人资料填写的省份
	 * @return
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 用户个人资料填写的省份
	 * @param province
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * 普通用户个人资料填写的城市
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 普通用户个人资料填写的城市
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 国家，如中国为CN
	 * @return
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 国家，如中国为CN
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。
	 * 若用户更换头像，原有头像URL将失效。
	 * @return
	 */
	public String getHeadimgurl() {
		return headimgurl;
	}

	/**
	 * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。
	 * 若用户更换头像，原有头像URL将失效。
	 * @param headimgurl
	 */
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	/**
	 * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
	 * @return
	 */
	public String[] getPrivilege() {
		return privilege;
	}

	/**
	 * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
	 * @param privilege
	 */
	public void setPrivilege(String[] privilege) {
		this.privilege = privilege;
	}

	/**
	 * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。详见：获取用户个人信息（UnionID机制）
	 * @return
	 */
	public String getUnionid() {
		return unionid;
	}

	/**
	 * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。详见：获取用户个人信息（UnionID机制）
	 * @param unionid
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String[] getTagid_list() {
		return tagid_list;
	}

	public void setTagid_list(String[] tagid_list) {
		this.tagid_list = tagid_list;
	}

}
