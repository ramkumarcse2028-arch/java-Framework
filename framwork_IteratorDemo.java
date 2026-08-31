import java.util.*;
import java.util.ArrayList;

public class framwork_IteratorDemo {
    public static void main(String[] args) 
	{

	//System.out.println("Hello");
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("first");
        arrList.add("second");
        arrList.add("third");

        ListIterator itr = arrList.listIterator(1);
        while(itr.hasNext())
        {
            String element = (String)itr.next();
            System.out.println(element);
            //itr.set(element + "--> ");
        }
	/*for(String element: arrList)
		System.out.println(element);*/

        /*while(itr.hasPrevious())
	{
            String element = (String)itr.previous();
            System.out.println(element);
        }*/

	

	
    }
}
