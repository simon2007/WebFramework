package org.blue.webframework.framework;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.InetAddress;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.blue.webframework.exception.BaseException;
import org.blue.webframework.exception.SystemException;
import org.blue.webframework.sys.email.service.EmailService;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.util.ErrorHandler;

import com.alibaba.fastjson.JSONObject;

/**
 * 异步异常处理
 * @author Long
 *
 */
public class BlueExceptionHandler  implements AsyncUncaughtExceptionHandler, ErrorHandler {
	private String newLine = "\r\n";
	private Logger logger = LogManager.getLogger(getClass());

	/**
	 * 异步任务异常处理
	 */
	@Override
	public void handleUncaughtException(Throwable exception, Method method, Object... arg2) {

		boolean needReportError = false;

		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);

		writer.write("args:" + newLine);
		if (arg2 != null) {
			for (Object obj : arg2) {
				if (obj == null)
					writer.write(" null" + newLine);
				else
					writer.write(" " + JSONObject.toJSONString(obj) + newLine);

			}
		}

		if (exception instanceof BaseException) {
			BaseException baseException = (BaseException) exception;
			writer.write("code:" + baseException.getCode() + newLine);
			writer.write("msg:" + baseException.getMessage() + newLine);
			if (exception instanceof SystemException)
				needReportError = true;// 系统异常要上报
		} else
			needReportError = true;// 其他异常要上报

		writer.write("exception:" + newLine);
		exception.printStackTrace(writer);
		StringBuffer buffer = stringWriter.getBuffer();
		String msg = buffer.toString();
		if (needReportError)
			reportException(exception, msg);
		logger.error(msg);
	}

	@Resource
	private EmailService emailService;

	private void reportException(Throwable ex, String msg) {
		try {

			String subject = "服务器异步执行出错";
			InetAddress addr = InetAddress.getLocalHost();
			subject += ",ip:" + addr.getHostAddress().toString();// 获得本机IP　　
			subject += ",name:" + addr.getHostName().toString();// 获得本机IP　
			emailService.sendEmailNew( subject, msg.replace(newLine, "<br/>").replace(" ", "&nbsp;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 定时任务异常处理
	 */
	@Override
	public void handleError(Throwable t) {
		handleUncaughtException(t,null);
		
	}

}
