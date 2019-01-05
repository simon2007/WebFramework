package org.blue.webservice.weixin.contollers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

import org.blue.sys.weixin.service.WeixinService;
import org.blue.sys.weixin.vo.UserWeixinMessageVo;
import org.blue.sys.weixin.vo.WeixinMessageVo;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("weixin/official/")
public class OfficialWeixinController {
	private final String token = "525670_i";//微信公众号中填写的token
	protected final String encodingAESKey = "If0CODguJ1pCmlui4MX15DHCgCk1PNXu3RCtybfYvbt";

	@Autowired
	private WeixinService weixinService;

	/**
	 * 接受微信服务器发来的消息
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @param echostr
	 * @param openId
	 * @param inMsg
	 * @param response
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping(value="recv", method = RequestMethod.GET)
	public void recv(@RequestParam(value = "signature", required = true) String signature, 
			@RequestParam(value = "timestamp", required = true) String timestamp, 
			@RequestParam(value = "nonce", required = true) String nonce, 
			@RequestParam(value = "echostr", required = true) String echostr, 

			HttpServletResponse response)
			throws IOException {
		
		String[] values = { token, timestamp, nonce };
		Arrays.sort(values); // 字典序排序
		String value = values[0] + values[1] + values[2];
		String sign = DigestUtils.sha1Hex(value);
		responseString(response, signature.equals(sign) ? echostr : "error");

	}
	/**
	 * 接受微信服务器发来的消息
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @param echostr
	 * @param openId
	 * @param inMsg
	 * @param response
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping(value="recv", method = RequestMethod.POST)
	public void recv(@RequestParam(value = "signature", required = true) String signature, 
			@RequestParam(value = "timestamp", required = true) String timestamp, 
			@RequestParam(value = "nonce", required = true) String nonce, 
			@RequestParam(value = "openid", required = true) String openId, 
			@RequestBody UserWeixinMessageVo inMsg, 
			HttpServletResponse response)
			throws IOException {

		WeixinMessageVo vo = weixinService.recvMessage(openId, inMsg);
		if (vo != null) {
			//有默认回复
			StringBuffer sb = new StringBuffer();
			sb.append("<xml>");
			sb.append("<ToUserName><![CDATA[").append(vo.getToUserName()).append("]]></ToUserName>");
			sb.append("<FromUserName><![CDATA[").append(vo.getFromUserName()).append("]]></FromUserName>");
			sb.append("<CreateTime>").append(vo.getCreateTime()).append("</CreateTime>");
			sb.append("<MsgType><![CDATA[").append(vo.getMsgType()).append("]]></MsgType>");
			if ("text".equalsIgnoreCase(vo.getMsgType()))
				sb.append("<Content><![CDATA[").append(vo.getContent()).append("]]></Content>");
			else  if ("location".equalsIgnoreCase(vo.getMsgType())) {
				sb.append("<Location_X>").append(vo.getLocationX()).append("</Location_X>");
				sb.append("<Location_Y>").append(vo.getLocationY()).append("</Location_Y>");
				sb.append("<Scale>").append(vo.getScale()).append("</Scale>");
				sb.append("<Label>").append(vo.getLabel()).append("</Label>");
			} 
			
			sb.append("</xml>");
			response.setContentType("application/xml");
			responseString(response, sb.toString());
			return;
		}
		//微信修改服务器地址，认证token用

			responseString(response,"success");
			return;
		
	}

	/**
	 * 让其他应用获取微信Token用,比如小能
	 * @param appid
	 * @param grantType
	 * @param secret
	 * @param response
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping("token")
	public void getToken(@RequestParam(value = "appid", required = true) String appid, @RequestParam(value = "grant_type", required = true) String grantType, @RequestParam(value = "secret", required = true) String secret, HttpServletResponse response)
			throws IOException {


		JSONObject obj = new JSONObject();
		obj.put("access_token", weixinService.getAccessToken(appid,secret));
		obj.put("expires_in", 7200);
		response.setContentType("application/json");
		responseString(response, obj.toJSONString());
	}

	/**
	 * 发送测试，发送消息到客户的公众号
	 * @testUrl https://xdy.zhaoxie.net/weixin/official/sendTest?text=asdf&openId=o_1vVt1HflTupT71Sj8snU0Icc-8
	 * @param text
	 * @param openId
	 * @param response
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping("sendTest")
	public void sendTest(@RequestParam(value = "text", required = true) String text, @RequestParam(value = "openId", required = true) String openId, HttpServletResponse response) throws IOException {
		JSONObject obj=new JSONObject();
		obj.put("content", text);
		weixinService.sendCustomMessage(openId,"text", obj);
	}
	
	/**
	 * 给第三方系统使用，发送消息到客户的公众号
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping("send")
	public void send(@RequestParam(value = "access_token", required = true)String accessToken,@RequestBody JSONObject message , HttpServletResponse response) throws IOException {
		String openId=message.getString("touser");
		String msgtype=message.getString("msgtype");
		JSONObject c=message.getJSONObject(msgtype);
		
		//weixinService.sendCustomMessageByCustId(accessToken,openId,msgtype, c);
	}

	private void responseString(HttpServletResponse response, String content) throws IOException {
		try (PrintWriter writer = response.getWriter()) {
			writer.print(content);
			writer.flush();
			writer.close();
		}
	}
}
