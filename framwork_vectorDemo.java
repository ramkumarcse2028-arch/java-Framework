import java.util.Vector;

public class framwork_vectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.addElement("MIT");
        vector.addElement("MIET");
        System.out.println("First Element: "+  vector.firstElement());
        System.out.println("First Element: "+  vector.lastElement());
        System.out.println(vector);
        vector.insertElementAt("KIET", 1);
        System.out.println(vector);
        System.out.println(2);
        System.out.println(vector);
        System.out.println(vector.removeElement("MIET"));
        System.out.println(vector);
        vector.removeAllElements();
        System.out.println(vector);
    }
}
