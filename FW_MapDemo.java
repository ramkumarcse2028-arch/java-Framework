import java.util.HashMap;
import java.util.Map;

public class FW_MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Ankush", 33);

        marks.put("Priyanshu", 33);
        marks.put(null, 48);

        System.out.println(marks);
        System.out.println("Marks of Ankush: " + marks.get("Ankush"));

        System.out.println(marks.remove(null));
        System.out.println(marks);
        System.out.println(marks.keySet());
        System.out.println(marks.values());
        System.out.println(marks.containsKey(null));
        System.out.println(marks.containsValue(33));
        System.out.println(marks.size());
        marks.clear();
        System.out.println(marks.isEmpty());
    }
}
