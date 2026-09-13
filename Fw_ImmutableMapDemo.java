import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Fw_ImmutableMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer>  map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);

        // map2.put("C" , 3); Exception throws
       /* Map<String, Integer> map3 = Map.of("Ram", 90, "Sita", 95);
        map3.put("Ankit", 98);
        Map<String,  Integer> map4 = Map.ofEntries(Map.entry("Ankit",99), Map.entry("Sita", 99));
        System.out.println("map4=" +map4);*/
         Map<String, Integer> map3 = Map.of("Ram", 90, "Sita", 95);
        System.out.println("map3 = " + map3);

        Map<String, Integer> map4 =
                Map.ofEntries(
                        Map.entry("Ankit", 99),
                        Map.entry("Sita", 99));

        System.out.println("map4 = " + map4);
    }
}
