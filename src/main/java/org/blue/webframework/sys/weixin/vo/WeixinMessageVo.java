package org.blue.webframework.sys.weixin.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xml")
public class WeixinMessageVo {
	@XmlElement(name = "ToUserName")
	private String toUserName;
	@XmlElement(name = "FromUserName")
	private String fromUserName;
	@XmlElement(name = "CreateTime")
	private long createTime;
	@XmlElement(name = "MsgType")
	private String msgType;


	// 文本消息
	@XmlElement(name = "Content")
	private String content;// 文本消息内容

	// 位置消息
	@XmlElement(name = "Location_X")
	private String locationX;
	@XmlElement(name = "Location_Y")
	private String locationY;
	@XmlElement(name = "Scale")
	private Long scale;
	@XmlElement(name = "Label")
	private String label;
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}
	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}
	public void setScale(Long scale) {
		this.scale = scale;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getToUserName() {
		return toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public long getCreateTime() {
		return createTime;
	}
	public String getMsgType() {
		return msgType;
	}

	public String getContent() {
		return content;
	}
	public String getLocationX() {
		return locationX;
	}
	public String getLocationY() {
		return locationY;
	}
	public Long getScale() {
		return scale;
	}
	public String getLabel() {
		return label;
	}

}
