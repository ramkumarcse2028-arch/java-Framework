import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class fw_LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 30);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Shubham", 80);
        hashMap.put("Ram" , 90);
        hashMap.put("Santosh", 91);
        Integer res = hashMap.getOrDefault("Ram", 0);
        System.out.println(res);

        
    }
}

