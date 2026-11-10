import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] array={3,5,9,13,24,7};
        int key=31;

        Map<Integer,Integer> m=new HashMap<>();
        for(int j=0;j<array.length;j++){
            int i=key-array[j];
            if(m.containsKey(i))
                System.out.println(m.get(i)+ " and "+j);
        m.put(array[j],j);       
        }
     }
}
