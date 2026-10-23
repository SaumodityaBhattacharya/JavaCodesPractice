import java.util.*;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
   ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);

        Collections.sort(numbers);
        System.out.println("--------------------Sorted list---------------");
        System.out.println(numbers);

        int target=6;
        int idx=Collections.binarySearch(numbers,target);
        if(idx>=0)
            System.out.println("Element "+target+" found at index "+idx);
        else
            System.out.println("Element not found anywhere");        
    }
}
