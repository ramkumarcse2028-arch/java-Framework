import java.util.ArrayList;

public class fw_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("size of list: " + list.size());

    

    }
}
// 4 ya 5 baar run karke try  karna tab samaj aayega output me ya different me
         