package org.blue.framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.blue.framework.web.XmlResultConver;
import org.blue.framework.webservice.WebApiResultConverter;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 针对responseBody返回值处理
 * 
 * @author Long
 *
 */
public class WebApiMethodResultConverter implements HandlerMethodReturnValueHandler {
	private static final MediaType MEDIA_TYPE_APPLICATION = new MediaType("application");
	private final ContentNegotiationManager contentNegotiationManager;
	private WebApiResultConverter webApiResultConverter = new WebApiResultConverter();
	private XmlResultConver xmlResultConver = new XmlResultConver();

	public WebApiMethodResultConverter() {
		this.contentNegotiationManager = new ContentNegotiationManager();
	}

	protected ServletServerHttpResponse createOutputMessage(NativeWebRequest webRequest) {
		HttpServletResponse response = (HttpServletResponse) webRequest.getNativeResponse(HttpServletResponse.class);
		return new ServletServerHttpResponse(response);
	}

	private List<MediaType> getAcceptableMediaTypes(NativeWebRequest request) throws HttpMediaTypeNotAcceptableException {
		List<MediaType> mediaTypes = this.contentNegotiationManager.resolveMediaTypes(request);
		return mediaTypes.isEmpty() ? Collections.singletonList(MediaType.ALL) : mediaTypes;
	}

	private MediaType getMostSpecificMediaType(MediaType acceptType, MediaType produceType) {
		produceType = produceType.copyQualityValue(acceptType);
		return MediaType.SPECIFICITY_COMPARATOR.compare(acceptType, produceType) <= 0 ? acceptType : produceType;
	}

	private void handleReturnValue(Object returnValue, AbstractHttpMessageConverter<Object> conver, NativeWebRequest request,MediaType defaultMediaType) throws HttpMediaTypeNotAcceptableException,
			HttpMessageNotWritableException, IOException {
		List<MediaType> requestedMediaTypes = getAcceptableMediaTypes(request);
		List<MediaType> producibleMediaTypes = conver.getSupportedMediaTypes();
		ServletServerHttpResponse outputMessage = createOutputMessage(request);
		Set<MediaType> compatibleMediaTypes = new LinkedHashSet<MediaType>();
		for (MediaType r : requestedMediaTypes) {
			for (MediaType p : producibleMediaTypes)
				if (r.isCompatibleWith(p))
					compatibleMediaTypes.add(getMostSpecificMediaType(r, p));
		}
		if (compatibleMediaTypes.isEmpty()) {
			throw new HttpMediaTypeNotAcceptableException(producibleMediaTypes);
		}

		List<MediaType> mediaTypes = new ArrayList<MediaType>(compatibleMediaTypes);
		MediaType.sortBySpecificityAndQuality(mediaTypes);

		MediaType selectedMediaType = null;
		for (MediaType mediaType : mediaTypes) {
			if (mediaType.isConcrete()) {
				selectedMediaType = mediaType;
				break;
			}
			if ((mediaType.equals(MediaType.ALL)) || (mediaType.equals(MEDIA_TYPE_APPLICATION))) {
				selectedMediaType = defaultMediaType;
				break;
			}
		}

		if (selectedMediaType != null) {
			selectedMediaType = selectedMediaType.removeQualityValue();
			conver.write(returnValue, selectedMediaType, outputMessage);
			return;
		}
		throw new HttpMediaTypeNotAcceptableException(conver.getSupportedMediaTypes());
	}

	@Override
	public void handleReturnValue(Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer, NativeWebRequest request) throws IOException, HttpMediaTypeNotAcceptableException {
		mavContainer.setRequestHandled(true);
		String packageName = returnType.getMethod().getDeclaringClass().getPackage().getName();
		if (packageName.startsWith("org.blue.webservice.weixin"))
			handleReturnValue(returnValue, xmlResultConver, request,MediaType.APPLICATION_XML);
		else
			handleReturnValue(returnValue, webApiResultConverter, request,MediaType.APPLICATION_JSON_UTF8);

	}

	public void setWebApiResultConverter(WebApiResultConverter webApiResultConverter) {
		this.webApiResultConverter = webApiResultConverter;
	}

	@Override
	public boolean supportsReturnType(MethodParameter returnType) {
		if (!returnType.hasMethodAnnotation(ResponseBody.class))
			return false;
		String packageName = returnType.getMethod().getDeclaringClass().getPackage().getName();
		return packageName.startsWith("com.shoe.webservice") || (packageName.startsWith("org.blue.webservice")&&!packageName.startsWith("org.blue.webservice.weixin")) || packageName.startsWith("org.blue.web.pc.member");
	}
}
