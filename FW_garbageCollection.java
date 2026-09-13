import java.lang.ref.WeakReference;

public class FW_garbageCollection {
    public static void main(String[] args) {
        WeakReference<Phone>phoWeakReference = new WeakReference<>(new Phone("Apple", "16 pro max"));
        System.out.println(phoWeakReference.get());
        try{
            Thread.sleep(10000);

        } catch(Exception ignored){
            System.out.println(phoWeakReference.get());
        }
       /*  Phone phone = new Phone ("Apple", "16 pro max");
        System.out.println(phone);
        phone =  null;
        System.out.println(phone);*/


    }
    
}
class Phone{

    String brand;

    String model;


    public Phone( String brand, String model){
        this.brand = brand;
        this.model = model;
    }
}
