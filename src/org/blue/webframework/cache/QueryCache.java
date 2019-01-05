package org.blue.webframework.cache;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 查询缓存器
 * 
 * @author Long
 *
 */
public class QueryCache extends BaseCache implements org.apache.ibatis.cache.Cache {

	private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

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
		put(key,value);
		
	}

	@Override
	public Object removeObject(Object key) {
		return remove(key);
	}

}
