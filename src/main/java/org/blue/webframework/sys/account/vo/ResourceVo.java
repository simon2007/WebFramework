package org.blue.webframework.sys.account.vo;

public class ResourceVo {
	private int id;
	private String name;
	private String code;
	private String comment;
	private String operates;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOperates() {
		return operates;
	}

	public void setOperates(String operates) {
		this.operates = operates;
	}
	@Override
	public String toString() {
		return "{id:"+id + ",name:"+name+"}";
	}
}
