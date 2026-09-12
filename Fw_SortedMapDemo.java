import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.SortedMap;


public class Fw_SortedMapDemo {
    public static void main(String[] args) {
       SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Vivek", 90);
        map.put("Ram", 91);
        map.put("Mohit", 95);
        System.out.println(map);
       // map.get(91);
       // map.containsKey(95);
       // map.containsValue(91);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Ram"));
        System.out.println(map.tailMap("Ram")); 

        // NavigableMap
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(3));
        System.out.println(navigableMap.higherKey(1));





    }
}
