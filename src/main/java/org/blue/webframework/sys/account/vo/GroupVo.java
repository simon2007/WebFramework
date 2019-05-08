package org.blue.webframework.sys.account.vo;

public class GroupVo {

	private long id;
	private String name;
	private boolean enable;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "{id:"+id + ",name:"+name+"}";
	}
}
