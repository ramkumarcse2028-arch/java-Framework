import java.util.LinkedHashSet;
import java.util.Set;

public class FW_setDemo {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Akash");
        names.add("Ankush");
        names.add("Adarsh");
        names.add("Happy");
        System.out.println(names.add("Deepanshi"));
        System.out.println(names.add("Deepanshi"));
        names.add(null);
        names.add(null);
        System.out.println(names);


    }
}
