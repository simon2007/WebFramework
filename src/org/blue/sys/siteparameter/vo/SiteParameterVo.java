package org.blue.sys.siteparameter.vo;

public class SiteParameterVo {
    private int paramId;

    private String paramName;

    private String paramValue;

    private String paramComment;

    private int operUser;

    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId;
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


    public int getOperUser() {
        return operUser;
    }

    public void setOperUser(int operUser) {
        this.operUser = operUser;
    }

}
