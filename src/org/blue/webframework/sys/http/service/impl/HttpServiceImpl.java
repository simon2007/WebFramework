package org.blue.webframework.sys.http.service.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.blue.webframework.sys.http.service.HttpService;
import org.blue.webframework.sys.http.utils.ClientBuilder;
import org.blue.webframework.sys.siteparameter.service.SiteParameterService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

@Service("HttpService")
public class HttpServiceImpl implements HttpService {

	private final Log log = LogFactory.getLog(getClass());

	private final String DefaultEncoding = "utf-8";
	private final ContentType JsonContentType = ContentType.create("application/json", DefaultEncoding);
	private final ContentType XmlContentType = ContentType.create("text/xml", DefaultEncoding);
	
	@Override
	public String post(String sendUrl) throws IOException {
		return post(sendUrl, (List<? extends NameValuePair>) null);
	}

	@Resource
	private SiteParameterService siteParameterService;

	private CloseableHttpClient client;

	@PreDestroy
	public void destroy() {
		try {
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostConstruct
	public void init() {
		client = new ClientBuilder(siteParameterService).getClient();
	}

	protected String execute(HttpUriRequest request) throws ClientProtocolException, IOException {
		try (CloseableHttpResponse response = client.execute(request)) {
			HttpEntity entity = response.getEntity();
			Header encodingHeader = entity.getContentEncoding();

			if (encodingHeader != null)
				log.info("encoding=" + encodingHeader.getValue());

			String content = EntityUtils.toString(entity, DefaultEncoding);

			if (log.isDebugEnabled())
				log.debug("content=" + content);
			return content;
		}
	}

	protected String post(String sendUrl, HttpEntity entity) throws ClientProtocolException, IOException {
		HttpPost post = new HttpPost(sendUrl);
		post.setEntity(entity);
		return execute(post);
	}

	@Override
	public String post(String sendUrl, List<? extends NameValuePair> param) throws IOException {
		if (param == null)
			param = new ArrayList<NameValuePair>();
		return post(sendUrl, new UrlEncodedFormEntity(param, DefaultEncoding));
	}

	@Override
	public String get(String sendUrl) throws IOException {
		HttpGet post = new HttpGet(sendUrl);
		return execute(post);
	}

	@Override
	public String post(String sendUrl, JSONObject sendParam) throws IOException {
		StringEntity entity = new StringEntity(sendParam.toString(), JsonContentType);
		return post(sendUrl, entity);
	}

	@Override
	public String post(String sendUrl, Map<String, String> param) throws IOException {
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		if (param != null) {
			for (Entry<String, String> entry : param.entrySet())
				list.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		return post(sendUrl, list);
	}

	@Override
	public String postXml(String sendUrl, Object obj) throws IOException {
		try {

			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, DefaultEncoding);
			StringWriter writer = new StringWriter();

			marshaller.marshal(obj, writer);
			StringEntity entity = new StringEntity(writer.toString(), XmlContentType);
			
			return post(sendUrl, entity);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

}
