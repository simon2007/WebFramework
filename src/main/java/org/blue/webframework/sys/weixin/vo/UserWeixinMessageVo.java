package org.blue.webframework.sys.weixin.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xml")
public class UserWeixinMessageVo {
	@XmlElement(name = "ToUserName")
	private String toUserName;
	@XmlElement(name = "FromUserName")
	private String fromUserName;
	@XmlElement(name = "CreateTime")
	private long createTime;
	@XmlElement(name = "MsgType")
	private String msgType;
	@XmlElement(name = "MsgId")
	private String msgId;

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
	
	// 链接消息
	@XmlElement(name = "Title")
	private String title;
	@XmlElement(name = "Description")
	private String description;
	@XmlElement(name = "Url")
	private String Url;
	
	// 语音信息
	@XmlElement(name = "MediaId")
	private String mediaId;
	@XmlElement(name = "Format")
	private String format;
	@XmlElement(name = "Recognition")
	private String recognition; // 语音识别结果
	
	// 事件
	@XmlElement(name = "Event")
	private String event;
	@XmlElement(name = "EventKey")
	private String eventKey;
	@XmlElement(name = "Ticket")
	private String ticket;
	@XmlElement(name = "Latitude")
	private String latitude;
	@XmlElement(name = "Longitude")
	private String longitude;
	@XmlElement(name = "Precision")
	private String precision;
	
	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getPrecision() {
		return precision;
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

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return Url;
	}

	public String getMediaId() {
		return mediaId;
	}

	public String getFormat() {
		return format;
	}

	public String getEvent() {
		return event;
	}

	public String getEventKey() {
		return eventKey;
	}

	public String getTicket() {
		return ticket;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	@XmlElement(name = "PicUrl")
	private String picUrl;// 图片链接

	@XmlElement(name = "ThumbMediaId")
	private String thumbMediaId;// 视频缩略图

	public String getRecognition() {
		return recognition;
	}

	public String getToUserName() {
		return toUserName;
	}

	public void setUserName(String fromUserName) {
		this.fromUserName = fromUserName;
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

	public String getMsgId() {
		return msgId;
	}

}
