import java.util.EnumMap;
import java.util.Map;
public class Fw_EnumMapDemo {
    public static void main(String[] args) {
        // array of size same as enum
        // no hashing 
        //  ordinal/ index is used
        //  FASTER THAN HASHMAP
        //   MEMORY EFFICIENT
        // [ _,_,_,"gYM",_]
        

         // EnumMap uses enum constants as keys
        Map<Day, String> map = new EnumMap<>(Day.class);

        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");

        String s = map.get(Day.TUESDAY);

        System.out.println("Tuesday Activity: " + s);
        System.out.println(map);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
    FRIDAY, SATURDAY, SUNDAY
}