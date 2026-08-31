import java.util.ArrayList;

public class framework_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(67);
        List.add(80);
        System.out.println(List.get(2));
        System.out.println(List.size());

        // first method
        /*for(int i = 0; i< List.size(); i++){
            System.out.println(List.get(i));
        }*/

        // csecondn methoed 
        for(int x: List){
            System.out.println(x);
        }


        System.out.println(List.contains(5));
        System.out.println(List.contains(1));

       /*List.remove(2);
        for(int x: List){
            System.out.println(x);
        }*/

        /*List.add(2, 50);
        for(int x: List){
            System.out.println(x);
        }*/

        List.set(2, 50);
        System.out.println(List);


    }
    
}
