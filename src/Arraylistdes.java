import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdes {
        public static void main(String args[])
        {
// creating object of ArrayList class
            ArrayList<String> list = new ArrayList<String>();
// adding elements to the ArrayList
            list.add("Inheritence");
            list.add("Polymorphism");
            list.add("Abstraction");
            list.add("Dataencapsulation");
            list.add("Constructor");
            list.add("Method overloading");
            list.add("Tokens");
            list.add("Array");
// printing the unsorted ArrayList
            System.out.println("Before Sorting: "+ list);
// Sorting ArrayList in ascending Order
            Collections.sort(list);
// printing the sorted ArrayList
            System.out.println("After Sorting (Ascending): "+ list);
// Sorting ArrayList in Descending Order
            Collections.sort(list, Collections.reverseOrder());
// printing the sorted ArrayList
            System.out.println("After Sorting (Descending): "+ list);
        }
}

