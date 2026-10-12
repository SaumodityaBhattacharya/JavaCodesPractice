import java.util.*;
import java.util.Iterator;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<10;i++){
            al.add(i);
        }
        System.out.println(al);
    al.forEach(num->System.out.println(num));
    }
}
