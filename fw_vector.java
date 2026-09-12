
import java.util.Vector;

public class fw_vector {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
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
// 5 bbar run karken try karna tab samj aayega array or vector me 
