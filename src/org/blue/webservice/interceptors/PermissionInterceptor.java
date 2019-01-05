package org.blue.webservice.interceptors;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.blue.framework.webservice.ResultModel;
import org.blue.framework.webservice.ResultModel.Result;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;



/**
 * 签名检查拦截器
 * 
 * @author long
 * 
 */
public class PermissionInterceptor implements HandlerInterceptor {
	private 	Logger logger = Logger.getLogger(PermissionInterceptor.class);
	private List<String> NO_NEED_AUTH_LIST = 
			new ArrayList<String>(
					Arrays.asList(
							"/users/login.do", 
							"homePage/getAgentList.do", 
							"homePage/getLastOrderAndRoundPics", 
							"/appVersion/getLastVersion.do", 
							"/agent/getAgentAndReply.do", 
							"/agent/customerChooseService.do", 
							"/agent/getClassList.do", 
							"/agent/getDetailDataByAgentId.do", 
							"/agent/getDetailDataByVenderMobile.do", 
							"/agent/customerGetVender.do", 
							"/parameter/getArealist.do", 
							"/parameter/getTermsOfService.do", 
							"/logistics/getList.do", 
							"/goods/getSearchConditions.do", 
							"/users/updateGetui.do", 
							"/users/pushMessage.do", 
							"/users/checkMessagesend.do", 
							"/users/checkIndentifyingCode.do", 
							"/users/register.do",
							"/users/modifyPwd", 
							"/order/agentGetOrder.do", 
							"/order/deleteOrder.do", 
							"/product/getClazz.do", 
							"/product/getColorList.do", 
							"/product/getSizeList.do", 
							"/product/getChildSizeList.do", 
							"/parameter/getArealist.do",
							"/users/weixinLogin",
							"/homePage/getPicsAndProductList.do",
							"/product/searchProduct.do",
							"/goods/getDetail.do",
							"/agent/getProductDataByCustId.do",
							"/findMoney/getList.do",
							"/findMoney/insertFindMoneyLink.do",
							"/vender/searchVenderBrand.do",
							"/users/getCompanyInfo.do",
							"/welcome/prologue.do",
							"product/getIntelligenceProductList.do",
							"/homePage/getProductGroup.do",
							"/users/indentifyingCodeLogin.do",
							"/users/checkusername.do",
							"/product/getHomePageProductRmdList.do",
							"/welcome/etest",
							"/users/bundling",
							"/users/isExsit",
							"/users/QQLogin",
							"/product/getGroupProduct.do",
							"/commmon/getAttrList",
							"/getHomePageProductList.do",
							"question/getUserCouponDrawList.do",
							"question/getIds.do",
							"question/getQuestionList.do",
							"product/searchProductByImg",
							"webapi/homePage/getOrderActList.do",
							"webapi/homePage/getHomePageActInfo.do",
							"webapi/homePage/getProductGroup1.do",
							"webapi/homePage/getPrimeArea"
							));
	
	private List<String> NO_NEED_SIGN_LIST = 
			new ArrayList<String>(
					Arrays.asList(
							"/webapi/product/getXiaoNengProductDetail"
				));


	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		String requestSign = request.getParameter("sign");
		String requesturi=request.getRequestURI();
		
		// 如果有不用认证sign的网络请求则执行下一步
		for (int i = 0; i < NO_NEED_SIGN_LIST.size(); ++i) {
			if (requesturi.contains(NO_NEED_SIGN_LIST.get(i))) {
				if(logger.isDebugEnabled())
				logger.debug("requesturi="+requesturi + " not need sign");
				return true;
			}
		}
				
		if (requestSign == null || requestSign.length() <= 0)
		{
			requestLoginFail(response,"登录凭证为空，请重新登录");
			return false;
		}
		String sign = getSign(request,"cd6161d78d1470357052d94086b7e1cb");//旧签名

		if (!requestSign.equalsIgnoreCase(sign)) {
			sign = getSign(request, "cd6161d78d147035530741d87d1616dc");// 新签名
			if (!requestSign.equalsIgnoreCase(sign)) {
				logger.info(" requestSign.equalsIgnoreCase(sign)==false");
				requestLoginFail(response, "登录凭证验证失败，请重新登录");
				return false;
			}
		}
		
		
		// 如果有不用认证的网络请求则执行下一步
		for (int i = 0; i < NO_NEED_AUTH_LIST.size(); ++i) {
			if (requesturi.contains(NO_NEED_AUTH_LIST.get(i))) {
				if(logger.isDebugEnabled())
				logger.debug("requesturi="+requesturi + " not need auth");
				return true;
			}
		}

			return true;


	}
	
	
	private void requestLoginFail(HttpServletResponse response,String msg) throws IOException
	{
		response.setHeader("Content-type", "application/json");
		ResultModel resultModel=new ResultModel();
		//Result model = new Result("10000", "登陆验证失败，请重新登陆");
		Result model = new Result("10000", msg);
		resultModel.setResult(model);
		String data = JSONObject.toJSONString(resultModel);
		OutputStream stream = response.getOutputStream();
		stream.write(data.getBytes("UTF-8"));
		stream.flush();
		
	}

	private String getSign(HttpServletRequest request,String signKey) {
		Enumeration<?> enumeration = request.getParameterNames();
		List<String> names = new ArrayList<String>();
		while (enumeration.hasMoreElements())
			names.add(enumeration.nextElement().toString());

		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});

		StringBuffer sb = new StringBuffer();
		for (String key : names) {
			if (key.equalsIgnoreCase("sign"))
				continue;

			
			sb.append(key).append("=");
			
			String[] values=request.getParameterValues(key);
			for(int i=0;i<values.length;i++)
			{
				if(i >0)
					sb.append(",");
				sb.append(values[i]);
			}
			sb.append("&");
		}

		sb.append(signKey);
		return string2MD5(sb.toString());
	}

	/***
	 * MD5加码 生成32位md5码
	 */
	public static String string2MD5(String inStr) {
			StringBuffer md5str = null;
			try {
				// 1 创建一个提供信息摘要算法的对象，初始化为md5算法对象
				MessageDigest md = MessageDigest.getInstance("MD5");

				// 2 将消息变成byte数组, *一定要设置utf-8
				byte[] input = inStr.getBytes("utf-8");

				// 3 计算后获得字节数组,这就是那128位了
				byte[] buff = md.digest(input);

				// 4 把数组每一字节（一个字节占八位）换成16进制连成md5字符串
				md5str = bytesToHex(buff);

				return md5str.toString();
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
	}
	
	/**
	 * 二进制转十六进制
	 * 
	 * @param bytes
	 * @return
	 */
	private static StringBuffer bytesToHex(byte[] bytes) {
		StringBuffer md5str = new StringBuffer();
		// 把数组每一字节换成16进制连成md5字符串
		int digital;
		for (int i = 0; i < bytes.length; i++) {
			digital = bytes[i];

			if (digital < 0) {
				digital += 256;
			}
			if (digital < 16) {
				md5str.append("0");
			}
			md5str.append(Integer.toHexString(digital));
		}
		return md5str;
	}

}
