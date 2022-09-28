package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    public Map<String, String> storage;

    public InMemoryKV() {
    }

    public InMemoryKV(Map<String, String> storage) {
        Map<String, String> deepCopy = new HashMap<String, String>();
        for(String key : storage.keySet()) {
            deepCopy.put(key, storage.get(key));
        }
        this.storage = deepCopy;
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> deepCopy = new HashMap<String, String>();
        for(String key : storage.keySet()) {
            deepCopy.put(key, storage.get(key));
        }
        return deepCopy;
    }
}

// END
