import java.util.LinkedList;
import java.util.Arrays;

public class fw_linkedListt {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.addLast(4);
        linkedList.addFirst(0);
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeIf( x ->  x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat", "dog", "Elephant"));
        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("dog", "Lion"));
        animals.remove(animalToRemove);
        System.out.println(animals);
        System.out.println(animalToRemove);

    }
}
