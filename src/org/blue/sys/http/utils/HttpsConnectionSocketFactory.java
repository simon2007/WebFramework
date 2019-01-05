package org.blue.sys.http.utils;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

public class HttpsConnectionSocketFactory extends SSLConnectionSocketFactory {

	public HttpsConnectionSocketFactory() {
		super(getSSLContext(), new AllowAllHostnameVerifier());
	}

	private static SSLContext getSSLContext() {
		try {
			X509TrustManager x509m = new HttpTrustManager();
			// 获取一个SSLContext实例
			SSLContext sslcontext = SSLContext.getInstance("SSL");
			// 初始化SSLContext实例
			sslcontext.init(null, new TrustManager[] { x509m }, new java.security.SecureRandom());
			return sslcontext;
		} catch (KeyManagementException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
}
