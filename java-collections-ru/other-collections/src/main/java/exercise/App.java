package exercise;

import java.util.*;

// BEGIN
public class App {

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        TreeSet<String> resultKeys = new TreeSet<>();
        Set<String> data1Keys = data1.keySet();
        Set<String> data2Keys = data2.keySet();
        resultKeys.addAll(data1Keys);
        resultKeys.addAll(data2Keys);

        for (String k: resultKeys) {
            if (!data1.containsKey(k)) {
                result.put(k, "added");
            } else if (!data2.containsKey(k)) {
                result.put(k, "deleted");
            } else if (data1.get(k).equals(data2.get(k))) {
                result.put(k, "unchanged");
            } else {
                result.put(k, "changed");
            }
        }
        return result;
    }

    public static void main (String[] args) {
        Map<String, Object> data1 = new HashMap<>(
                Map.of("one", "eon", "two", "two", "four", true));
        System.out.println(data1); //=> {two=two, four=true, one=eon}

        Map<String, Object> data2 = new HashMap<>(
                Map.of("two", "own", "zero", 4, "four", true)
        );
        System.out.println(data2); //=> {zero=4, two=own, four=true}

        Map<String, String> result = App.genDiff(data1, data2);
        System.out.println(result); //=> {four=unchanged, one=deleted, two=changed, zero=added}
    }
}
//END
