import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={3,1,2,1,4,4};
        HashSet seen=new HashSet<>();
       for(int n:arr){
        if(!seen.add(n)){
            System.out.print(n+" ");
        }
         }
    }
}
