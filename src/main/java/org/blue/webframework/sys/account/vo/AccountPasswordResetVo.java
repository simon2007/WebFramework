package org.blue.webframework.sys.account.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class AccountPasswordResetVo {
	@ApiModelProperty(name = "name", value = "登录名", dataType = "java.lang.String", example = "admin")
	private String name;
	@ApiModelProperty(name = "newPassword", value = "新密码", dataType = "java.lang.String", example = "123456789")
	private String newPassword;

	@ApiModelProperty(name = "oldPassword", value = "旧密码", dataType = "java.lang.String", example = "123456")
	private String oldPassword;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}



}
