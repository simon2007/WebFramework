package org.blue.webframework.sys.weixin.vo;



public class UserIdentificationVo  {

	private String openid;
	private String unionId;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	@Override
	public String toString() {
		return "openId:" + openid + ",unionId:" + unionId;
	}
}
