package org.blue.webframework.sys.account.vo;

import java.util.Date;

public class AccountVo {
	private String avatar;
	private Date createdTime;
	private boolean enable;
	private long groupId;
	private long id;
	private String name;
	private String openId;
	private long roleId;
	
	
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

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	
	@Override
	public String toString() {
		return "{id:"+id + ",name:"+name+"}";
	}
}
