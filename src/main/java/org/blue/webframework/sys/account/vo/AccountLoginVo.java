package org.blue.webframework.sys.account.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class AccountLoginVo {
	@ApiModelProperty(name = "name", value = "登录名", dataType = "java.lang.String", example = "admin")
	private String name;
	@ApiModelProperty(name = "password", value = "登录密码", dataType = "java.lang.String", example = "123456789")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
