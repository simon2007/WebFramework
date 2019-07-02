package org.blue.webframework.sys.attach.model;

import java.util.Date;

public class Attach {
	private int id;

    private String name;

    private String fileType;

    private String filePath;

    private String attachDesc;

    private boolean removeTag;

    private int accountId;

    private Date addDate;
    private String attachType;
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
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String contentType) {
		this.fileType = contentType;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getAttachDesc() {
		return attachDesc;
	}
	public void setAttachDesc(String attachDesc) {
		this.attachDesc = attachDesc;
	}
	public boolean isRemoveTag() {
		return removeTag;
	}
	public void setRemoveTag(boolean removeTag) {
		this.removeTag = removeTag;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public String getAttachType() {
		return attachType;
	}
	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}
    
}
