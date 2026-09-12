import java.util.Map;
import java.util.WeakHashMap;

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
public class Fw_WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();

        loadCache(imageCache);

        System.out.println("Before GC: " + imageCache);

        System.gc();

        simulateApplicationRunning();

        System.out.println("After GC: " + imageCache);
    }

    public static void loadCache(Map<String, Image> imageCache) {
        String k1 = new String("img1");
        String k2 = new String("img2");

        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));

        // Remove strong references
        k1 = null;
        k2 = null;
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
