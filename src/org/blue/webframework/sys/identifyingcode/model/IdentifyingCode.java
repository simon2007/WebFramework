package org.blue.webframework.sys.identifyingcode.model;

import java.util.Date;

public class IdentifyingCode {
    private Long identifyingCodeId;

    private String phone;

    private String identifyingCode;


    private Date addTime;

    private String aliveFlag;
    
    private String content;

    private Integer aliveTime;
    
    private Long userId;

    public Long getIdentifyingCodeId() {
        return identifyingCodeId;
    }

    public void setIdentifyingCodeId(Long identifyingCodeId) {
        this.identifyingCodeId = identifyingCodeId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdentifyingCode() {
        return identifyingCode;
    }

    public void setIdentifyingCode(String identifyingCode) {
        this.identifyingCode = identifyingCode == null ? null : identifyingCode.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getAliveTime() {
        return aliveTime;
    }

    public void setAliveTime(Integer aliveTime) {
        this.aliveTime = aliveTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAliveFlag() {
        return aliveFlag;
    }

    public void setAliveFlag(String aliveFlag) {
        this.aliveFlag = aliveFlag == null ? null : aliveFlag.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}