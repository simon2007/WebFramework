package org.blue.webframework.sys.attach.vo;

import java.util.Date;

public class AttachVo {
	private Long id;

    private String rootId;

    private String name;

    private String fileType;

    private String filePath;

    private String attachDesc;

    private boolean removeTag;

    private Long userId;

    private Date addDate;
    private String attachType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRootId() {
		return rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
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
	public void setFileType(String fileType) {
		this.fileType = fileType;
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
