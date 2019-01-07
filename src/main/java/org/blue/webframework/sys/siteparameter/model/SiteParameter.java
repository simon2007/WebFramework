package org.blue.webframework.sys.siteparameter.model;

public class SiteParameter implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5917081133749970061L;

	private int paramId;

    private String paramName;

    private String paramValue;

    private String paramComment;

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


    public Integer getRemoveTag() {
        return removeTag;
    }

    public void setRemoveTag(Integer removeTag) {
        this.removeTag = removeTag;
    }

}