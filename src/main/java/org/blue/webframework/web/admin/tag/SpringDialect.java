package org.blue.webframework.web.admin.tag;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.lang.Nullable;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.context.IWebContext;
import org.thymeleaf.expression.IExpressionObjectFactory;
import org.thymeleaf.spring5.dialect.SpringStandardDialect;
import org.thymeleaf.spring5.expression.SpringStandardExpressionObjectFactory;
import org.thymeleaf.standard.expression.IStandardVariableExpressionEvaluator;

public class SpringDialect extends SpringStandardDialect {
	static class ExtSpringStandardExpressionObjectFactory extends SpringStandardExpressionObjectFactory {
		@Override
		public Object buildObject(IExpressionContext context, String expressionObjectName) {
			if ("cookies".equals(expressionObjectName))
				return new Cookies(context);
			return super.buildObject(context, expressionObjectName);
		}

		@Override
		public Set<String> getAllExpressionObjectNames() {

			Set<String> allExpressionObjectNames = new LinkedHashSet<String>();
			allExpressionObjectNames.addAll(super.getAllExpressionObjectNames());
			allExpressionObjectNames.add("cookies");
			return allExpressionObjectNames;
		}

		@Override
		public boolean isCacheable(String expressionObjectName) {
			if ("cookies".equals(expressionObjectName))
				return false;
			return super.isCacheable(expressionObjectName);
		}
	}

	static class Cookies {
		private IExpressionContext context;

		public Cookies(IExpressionContext context) {
			this.context = context;
		}

		@Nullable
		public String get(String name) {
			if (context instanceof IWebContext) {
				HttpServletRequest request = ((IWebContext) context).getRequest();
				Cookie[] cookies = request.getCookies();
				if (cookies != null) {
					for (int i = 0; i < cookies.length; i++)
						if (cookies[i].getName().equals(name))
							return cookies[i].getValue();
				}
			}
			return null;
		}

	}

	ExtSpringStandardExpressionObjectFactory ex;

	@Override
	public IExpressionObjectFactory getExpressionObjectFactory() {

		if (ex == null)
			ex = new ExtSpringStandardExpressionObjectFactory();
		return ex;
	}

	@Override
	public IStandardVariableExpressionEvaluator getVariableExpressionEvaluator() {

		return super.getVariableExpressionEvaluator();
	}
}
