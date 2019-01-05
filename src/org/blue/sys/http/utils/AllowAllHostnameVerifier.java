package org.blue.sys.http.utils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AllowAllHostnameVerifier implements HostnameVerifier {

	private final Logger log = LogManager.getLogger(getClass());

	@Override
	public boolean verify(String host, SSLSession session) {
		if (log.isDebugEnabled())
			log.debug("verify host=" + host);
		return true;
	}

}