package org.blue.webframework.sys.account.vo;

import java.util.Date;

public class AccountVo {
	private String avatar;
	private Date createdTime;
	private boolean enable;
	private int groupId;
	private int id;
	private String name;
	private String openId;
	private int roleId;
	
	
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

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	@Override
	public String toString() {
		return "{id:"+id + ",name:"+name+"}";
	}
}
