package org.blue.webframework.sys.account.model;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String avatar;
	private Date createdTime;
	private boolean enable;
	private long groupId;
	private long id;
	private String name;
	private String openId;
	private String password;
	private long roleId;

	/**
	 * 头像
	 * @return
	 */
	public String getAvatar() {
		return avatar;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public boolean getEnable() {
		return enable;
	}

	public long getGroupId() {
		return groupId;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOpenId() {
		return openId;
	}

	public String getPassword() {
		return password;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

}
