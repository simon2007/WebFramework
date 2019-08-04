package org.blue.webframework.sys.account.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class AccountOpenIdVo {
	@ApiModelProperty(name = "openId", value = "openId", dataType = "java.lang.String", example = "123")
	private String openId;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
