import java.util.concurrent.ConcurrentSkipListMap;

public class Fw_ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("Apple", 2);
    }
}
  