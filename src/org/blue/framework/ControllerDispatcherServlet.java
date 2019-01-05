package org.blue.framework;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blue.framework.view.BlueRedirectView;
import org.blue.utils.StringHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 解决文件上传获取request参数不一致
 * 
 * @author Long
 *
 */
public class ControllerDispatcherServlet extends DispatcherServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
		System.out.println("************tell mybatis use log4j************");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!(request instanceof MultipartHttpServletRequest)) {
			request = checkMultipart(request);
		}
		super.service(request, response);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1423198663071164667L;
	private final String REDIRECTSTRING = "redirect:";

	@Override
	protected void initStrategies(ApplicationContext context) {

		super.initStrategies(context);

		try {
			Field f = DispatcherServlet.class.getDeclaredField("handlerAdapters");
			f.setAccessible(true);
			@SuppressWarnings("unchecked")
			List<HandlerAdapter> handlers = (List<HandlerAdapter>) f.get(this);
			for (int i = 0; i < handlers.size(); i++) {
				if (handlers.get(i) instanceof RequestMappingHandlerAdapter) {
					RequestMappingHandlerAdapter ada = (RequestMappingHandlerAdapter) handlers.get(i);
					List<HandlerMethodReturnValueHandler> list = new ArrayList<HandlerMethodReturnValueHandler>(ada.getReturnValueHandlers());

					list.add(0, context.getBean(WebApiMethodResultConverter.class));

					ada.setReturnValueHandlers(list);
					break;
				}
			}

		} catch (NoSuchFieldException |SecurityException |IllegalArgumentException |IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void render(ModelAndView mav, HttpServletRequest request, HttpServletResponse response) throws Exception {

		try {
			if (mav.isReference()) {
				String viewName = mav.getViewName();

				if (!StringHelper.isNullOrEmpty(viewName) && viewName.startsWith(REDIRECTSTRING)) {// 拦截重定向
					String redirectUrl = viewName.substring(REDIRECTSTRING.length());
					mav.setView(new BlueRedirectView(redirectUrl));
				}
			} else {
				View view = mav.getView();
				if (view instanceof RedirectView) {// 拦截重定向
					RedirectView rv = (RedirectView) view;
					mav.setView(new BlueRedirectView(rv.getUrl()));
				}
			}
			super.render(mav, request, response);
		} catch (Exception e) {

			processHandlerException(request, response, null, e);
			throw e;
		}
	}
}
