import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private static CacheManager instance;
    private static Object monitor = new Object();
    private Map<String, Object> cache = Collections.synchronizedMap(new HashMap<>());

    private CacheManager() {
        // Private constructor to prevent instantiation.
    }

    public void put(String cacheKey, Object value) {
        cache.put(cacheKey, value);
    }

    public Object get(String cacheKey) {
        return cache.get(cacheKey);
    }

    public void clear(String cacheKey) {
        cache.remove(cacheKey);
    }

    public void clear() {
        cache.clear();
    }

    // Singleton getInstance method with double-checked locking
    public static CacheManager getInstance() {
        if (instance == null) {
            synchronized (monitor) {
                if (instance == null) {
                    instance = new CacheManager();
                }
            }
        }
        return instance;
    }
}
