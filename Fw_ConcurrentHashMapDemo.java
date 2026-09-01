import java.util.concurrent.ConcurrentHashMap;

public class Fw_ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        // java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        // only the segment being written to or read from is locked
        // read: do not require locking unless there is a write operation happening on the same segment
        // write: l;ock
        // java 8 --> no segmentation
        // --> Compare-And-Swap approach --> no locking except resizing or collision
        // Thread A last saw -->  x = 45
        // Thread A work -->x to 50
        // if x is still 45 than change it to 50else don't change and retry
        // put --.  index
        
    }
}
