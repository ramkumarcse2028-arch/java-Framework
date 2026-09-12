import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class fw_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);

        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Orange", 13);
        for(Map.Entry<String, Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Shubham", 91);
        hashMap.put("Bob", 91);
        hashMap.put("Akshit", 55);

        Integer res = hashMap.getOrDefault("vipul",  0);
        hashMap.put("Shubham", 92);
        System.out.println(hashMap);





    }
    
}
