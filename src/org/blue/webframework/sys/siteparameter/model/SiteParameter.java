package org.blue.webframework.sys.siteparameter.model;

import java.util.Date;

public class SiteParameter implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5917081133749970061L;

	private int paramId;

    private String paramName;

    private String paramValue;

    private String paramComment;

    private Date operTime;

    private String operUser;

    private Integer removeTag;

    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId ;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getParamComment() {
        return paramComment;
    }

    public void setParamComment(String paramComment) {
        this.paramComment = paramComment == null ? null : paramComment.trim();
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public String getOperUser() {
        return operUser;
    }

    public void setOperUser(String operUser) {
        this.operUser = operUser == null ? null : operUser.trim();
    }

    public Integer getRemoveTag() {
        return removeTag;
    }

    public void setRemoveTag(Integer removeTag) {
        this.removeTag = removeTag;
    }

}