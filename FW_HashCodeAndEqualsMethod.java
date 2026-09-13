import java.util.HashMap;

public class FW_HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 3);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");
        System.out.println(map);

       //Map1<String, Integer> map1 = new HashMap<>();
      /*  Map1<String, Integer> map1 = new HashMap<>();
       map1.put("Shubham", 92);
       map1.put("Neha", 92);
       map1.put("Shubham", 99);

       System.out.println(map1);*/

       System.out.println("HashMap Size: " + map.size());
       System.out.println(" Value for p1: " + map.get(p1));
       System.out.println("Value for p3: " + map.get(p3));
       System.out.println(p1);


    }
    
}
class Person{
    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    @Override
    public int hashCode(){

        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        //return super.equals(obj);
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }

        if(getClass() != obj.getClass()){
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Object.equals(name, other.getName());
    }
    @Override
    public String toString(){

        return super.toString();
    }
}
