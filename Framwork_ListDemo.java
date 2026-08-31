import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Framwork_ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("MIET");
        list.add("MIT");
        list.add("KIET");
        list.add("MIT");
        list.add("BIT");

        System.out.println(list.indexOf("MIT"));
        System.out.println(list.lastIndexOf("MIT"));

        System.out.println(list.remove("MIT"));
        System.out.println(list.remove(3));
        System.out.println(list);
    }
}

