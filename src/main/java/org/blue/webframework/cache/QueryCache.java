package org.blue.webframework.cache;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.opensymphony.oscache.web.filter.ExpiresRefreshPolicy;

/**
 * 查询缓存器
 * 
 * @author Lilongwu
 *
 */
public class QueryCache extends BaseCache implements org.apache.ibatis.cache.Cache {

	private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	protected ExpiresRefreshPolicy refreshPolicy;

	public QueryCache(String id) {
		super(CacheManager.getCacheManager(), id);
	}

	public ReadWriteLock getReadWriteLock() {
		return this.readWriteLock;
	}

	@Override
	public Object getObject(Object key) {
		return get(key);
	}

	@Override
	public void putObject(Object key, Object value) {
		put(key, value, refreshPolicy);
	}

	@Override
	public Object removeObject(Object key) {
		return remove(key);
	}

	public void setFlushInterval(int flushInterval) {
		if (refreshPolicy == null)
			refreshPolicy = new ExpiresRefreshPolicy(flushInterval);
		else
			refreshPolicy.setRefreshPeriod(flushInterval);
	}

}
