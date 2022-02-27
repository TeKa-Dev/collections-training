package lessons;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "five");
        map.put(6, "six");
        map.put(3, "three");
        map.put(1, "one");
        map.put(7, "svn");
        map.put(10, "ten");
        map.put(4, "four");
        map.put(2, "two");
        map.put(7, "seven");
        map.putIfAbsent(2, "second");
        map.put(null, "NULL");
        map.put(null, null);

        System.out.println(map);
        System.out.println(map.get(7));
        System.out.println(map.remove(3));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

//        map.forEach(System.out::println);
    }
}
