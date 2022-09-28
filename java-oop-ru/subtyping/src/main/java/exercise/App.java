package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String,String> swapped= new HashMap<>();
        for(Map.Entry<String,String> entry : storage.toMap().entrySet()) {
            swapped.put(entry.getValue(), entry.getKey());
        }
        for(String key : swapped.keySet()) {
            storage.unset(swapped.get(key));
        }

        for(String key : swapped.keySet()) {
            storage.set(key, swapped.get(key));
        }
    }

    public static void main (String[] args) {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));

        storage.get("key", "default"); // "10"
        storage.get("unknown", "default"); // "default"

        storage.set("key2", "value2");
        storage.get("key2", "default"); // "value2"

        storage.unset("key2");
        storage.get("key2", "default"); // "default"

        Map<String, String> data = storage.toMap();
        System.out.println(data); // => {key=10};

        KeyValueStorage storage1 = new InMemoryKV(Map.of("key", "value", "key2", "value2"));
        App.swapKeyValue(storage1);
        storage1.get("key", "default"); // "default"
        storage1.get("value", "default"); // "key"

        System.out.println(storage1.toMap()); // => {value=key, value2=key2}
    }
}

// END
