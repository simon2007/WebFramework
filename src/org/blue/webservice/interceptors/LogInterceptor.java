package org.blue.webservice.interceptors;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.blue.utils.StringHelper;
import org.springframework.web.servlet.HandlerInterceptor;

public class LogInterceptor implements HandlerInterceptor{

	private final Logger logger = Logger.getLogger(LogInterceptor.class);

	public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		StringBuffer resultBuf = new StringBuffer();
		if (logger.isDebugEnabled()) {

			// 得到拦截的真实方法
			Object target = proceedingJoinPoint.getTarget();
			// 取得类名字
			String className = target.getClass().getName();
			// 方法名
			String method = proceedingJoinPoint.getSignature().getName();
			// 方法参数
			Object[] args = proceedingJoinPoint.getArgs();

			HttpServletRequest request = null;

			if (args != null) {
				// 通过分析aop监听参数分析出request等信息
				resultBuf.append(" 请求参数: " + "\r\n");

				for (int i = 0; i < args.length; i++) {
					if (args[i] instanceof HttpServletRequest) {
						request = (HttpServletRequest) args[i];
					} else {
						if (args[i] != null) {
							resultBuf.append("{");
							for (Field f : args[i].getClass().getDeclaredFields()) {
								f.setAccessible(true);
								resultBuf.append(f.getName() + ":" + f.get(args[i]) + "\r\n");
							}
							resultBuf.append("}" + "\n");
						}
					}
				}
			}

			if (request != null) {

				// ip地址
				String ip = request.getHeader("X-Real-IP");
				if (StringHelper.isBlank(ip)) {
					String remoteAddr = request.getRemoteAddr();
					ip = remoteAddr.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : remoteAddr;
				}
				resultBuf.append("请求ip: " + ip + "\r\n");
				// 获取请求地址
				String requestPath = request.getRequestURI();

				resultBuf.append(" 请求url: " + requestPath + "\r\n");
			}

			resultBuf.append("调用了类: " + className + " 的方法: " + method + "\r\n");
		}
		// 执行时间

		try {
			long b = System.currentTimeMillis();
			Object ret = proceedingJoinPoint.proceed();

			return ret;
		} catch (Throwable e) {
			if (logger.isDebugEnabled()) {
				resultBuf.append("异常:\r\n");
				resultBuf.append(e.toString() + "\r\n");
			}
			throw e;
		} finally {
			if (logger.isDebugEnabled())
				// 记录用户操作日志
				logger.debug(resultBuf);

		}
	}

}
