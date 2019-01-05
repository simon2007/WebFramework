package org.blue.webframework.cache;

import com.opensymphony.oscache.general.GeneralCacheAdministrator;

public class CacheManager {
    private static GeneralCacheAdministrator cacheAdmin = new GeneralCacheAdministrator();

    public static GeneralCacheAdministrator getCacheManager() {
        return cacheAdmin;
    }

    public static BaseCache getBaseCache(String key) {
        return new BaseCache(cacheAdmin, key);
    }
}
