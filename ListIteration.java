// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
import java.util.Iterator;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<10;i++){
            al.add(i);
        }
        System.out.println(al);
       Iterator<Integer> it= al.iterator();
       while(it.hasNext()){
           int i=it.next();
           if(i%2==0){
               it.remove();
           }
       }
           System.out.println(al);
    }
}
