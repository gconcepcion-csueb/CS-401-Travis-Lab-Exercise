package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Hello {
    
    /**
     * Linearly searches through List list and finds the first index that satisfies Predicate check
     * @param <T>
     * @param list
     * @param check
     * @return 
     */
    public static <T> int linearSearch(List<T> list, Predicate<T> check) {
        for (int i = 0; i < list.size(); i++) {
            T object = list.get(i);
            if (check.test(object))
                return i;
        }
        
        return -1;
    }
    
    
    public static void main(String [] args) {
        ArrayList<String> stringList = new ArrayList<>();
        
        stringList.add("Zero");     // 0
        stringList.add("One");      // 1
        stringList.add("Two");      // 2
        stringList.add("Three");    // 3
        stringList.add("Four");     // 4
        
        // find match in first position
        System.out.println("\"Zero\" is at location: " + linearSearch(stringList, str -> str.equals("Zero")));
        
        // find match in something other than first position
        System.out.println("\"Three\" is at location: " + linearSearch(stringList, str -> str.equals("Three")));
        
        // find no matching
        System.out.println("\"Ten\" is at location: " + linearSearch(stringList, str -> str.equals("Ten")));
        
        ArrayList<Integer> intList = new ArrayList<>();
        
        intList.add(0);     // 0
        intList.add(12);    // 1
        intList.add(4);     // 2
        intList.add(7);     // 3
        intList.add(10);    // 4
        
        
        // find match in first position
        System.out.println("0 is at location: " + linearSearch(intList, value -> value.equals(0)));
        
        // find match in something other than first position
        System.out.println("12 is at location: " + linearSearch(intList, value -> value.equals(12)));
        
        // find no matching
        System.out.println("20 is at location: " + linearSearch(intList, value -> value.equals(20)));
    }
}
