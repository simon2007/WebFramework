package org.blue.cache;

import com.opensymphony.oscache.base.NeedsRefreshException;
import com.opensymphony.oscache.general.GeneralCacheAdministrator;
import com.opensymphony.oscache.web.filter.ExpiresRefreshPolicy;

/**
 * 
 * @author long
 *
 */
public class BaseCache {

	protected final GeneralCacheAdministrator cacheAdmin;
	protected final String id;
	protected final static ExpiresRefreshPolicy defaultRefreshPolicy = new ExpiresRefreshPolicy(168 * 3600);

	public BaseCache(GeneralCacheAdministrator cacheAdmin, String id) {
		if (id == null || cacheAdmin == null) {
			throw new IllegalArgumentException("Cache instances require an ID");
		}
		this.cacheAdmin = cacheAdmin;
		this.id = id;
	}

	public void clear() {
		cacheAdmin.flushGroup(this.id);
	}

	public String getId() {
		return this.id;
	}

	public Object get(Object key) {
		String keyString = key.toString();
		Object ret = null;
		try {
			ret = cacheAdmin.getFromCache(keyString);
		} catch (NeedsRefreshException e) {
			cacheAdmin.cancelUpdate(keyString);
		}

		return ret;
	}

	public int getSize() {
		return cacheAdmin.getCache().getSize();
	}

	public void put(Object key, Object value) {
		put(key, value, defaultRefreshPolicy);
	}

	public void put(Object key, Object value, ExpiresRefreshPolicy refreshPolicy) {
		try {
			cacheAdmin.putInCache(key.toString(), value, new String[] { this.id }, refreshPolicy);
		} catch (Exception e) {
			cacheAdmin.cancelUpdate(key.toString());
		}
	}

	public Object remove(Object key) {
		String keyString = key.toString();
		Object ret = null;
		try {
			ret = cacheAdmin.getFromCache(keyString);
		} catch (NeedsRefreshException e) {
			cacheAdmin.cancelUpdate(keyString);
		}

		if (ret != null) {
			cacheAdmin.flushEntry(keyString);
		}

		return ret;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BaseCache)) {
			return false;
		}

		BaseCache otherCache = (BaseCache) obj;
		return this.id.equals(otherCache.getId());
	}

	public int hashCode() {
		return this.id.hashCode();
	}

	public String toString() {
		return "Cache {" + this.id + "}";
	}
}
