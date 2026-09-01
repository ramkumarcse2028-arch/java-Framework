import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fw_CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        // read more
       // CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // "copy on Write" means that wheneven a write operation
        // like adding or removeing an element 
        // instead of directly modifyiing the existing list 
        // a new copy of the list is create and the modifying is applied to copy
        // this ensure that other thread reading the written it's using modidied are unafterted 
        // read operation :- fast and direct sinces they happen on stable list without interfacefrom modification
        // write operation:-  a new copy of list is then create for every modification 
        //           the reference to  list is then update so that subsequent read use this now list
        // notepad --> notepad-copy
        // read more

        // Use String type because you're storing items like Milk, Eggs
        CopyOnWriteArrayList<String> shoppingList = new CopyOnWriteArrayList<>();

        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");

        System.out.println("Initial shopping List: " + shoppingList);

        for (String item : shoppingList) {
            if (item.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }

        System.out.println("Updated shopping List: " + shoppingList);

        // Shared list for threads
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        // Reader Thread
        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100);
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread: " + e);
            }
        });

        // Writer Thread
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500);
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        readerThread.start();
        writerThread.start();
    }
}
