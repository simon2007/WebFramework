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
	private int groupId;
	private int id;
	private String name;
	private String openId;
	private String password;
	private int roleId;

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

	public int getGroupId() {
		return groupId;
	}

	public int getId() {
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

	public int getRoleId() {
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

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public void setId(int id) {
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

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}


}
