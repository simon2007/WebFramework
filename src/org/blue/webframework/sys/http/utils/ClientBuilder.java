package org.blue.webframework.sys.http.utils;

import org.blue.webframework.sys.siteparameter.service.SiteParameterService;

import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class ClientBuilder {
	private final SiteParameterService siteParameterService;

	public ClientBuilder(SiteParameterService siteParameterService) {
		this.siteParameterService = siteParameterService;
	}

	public CloseableHttpClient getClient() {

		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

		httpClientBuilder.setConnectionManager(getConnectionManager());
		httpClientBuilder.setDefaultConnectionConfig(getConnectionConfig());
		httpClientBuilder.setRedirectStrategy(getRedirectStrategy());
		httpClientBuilder.setRetryHandler(getHttpRequestRetryHandler());
		httpClientBuilder.setUserAgent("zhaoxiewang/1.2");
		return httpClientBuilder.build();
	}
	
	private HttpRequestRetryHandler getHttpRequestRetryHandler()
	{
		return new DefaultHttpRequestRetryHandler(2,false);//重试2次
	}
	
	private RedirectStrategy getRedirectStrategy()
	{
		DefaultRedirectStrategy redirectStrategy=new DefaultRedirectStrategy();

		return redirectStrategy;
	}

	private ConnectionConfig getConnectionConfig() {
		ConnectionConfig.Builder builder = ConnectionConfig.custom();
		builder.setBufferSize(1400);
		
		return builder.build();
	}

	private HttpClientConnectionManager getConnectionManager() {
		RegistryBuilder<ConnectionSocketFactory> registryBuilder = RegistryBuilder.<ConnectionSocketFactory> create();
		registryBuilder.register("http", PlainConnectionSocketFactory.getSocketFactory());
		registryBuilder.register("https", new HttpsConnectionSocketFactory());

		Registry<ConnectionSocketFactory> socketFactoryRegistry = registryBuilder.build();
		// 初始化连接管理器
		PoolingHttpClientConnectionManager poolConnManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
		poolConnManager.setMaxTotal(200);
		poolConnManager.setDefaultMaxPerRoute(20);
		poolConnManager.setDefaultSocketConfig(getSocketConfig());
		poolConnManager.setDefaultConnectionConfig(getConnectionConfig());
		return poolConnManager;
	}
	

	private SocketConfig getSocketConfig() {
		int timeout = siteParameterService.getParamValue("http_timeout", 25000);

		SocketConfig.Builder builder = SocketConfig.custom();
		builder.setBacklogSize(50);
		builder.setRcvBufSize(1400);
		builder.setSoTimeout(timeout);
		builder.setTcpNoDelay(false);

		return builder.build();
	}
}
