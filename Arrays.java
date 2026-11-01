import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] x={1,2,3,4};
        int[] y={2,3,5};
        int[] z={1,2,4};
        System.out.println(Arrays.compare(x,y));
        int [] dupe=Arrays.copyOf(x,x.length);
        for(int n:dupe){
            System.out.print(n+" ");
        }
        System.out.println();
        int[] trunc=Arrays.copyOf(x,3);
        for(int t:trunc){
            System.out.print(t+" ");
        }
        int[] padded= Arrays.copyOf(y,6);
        System.out.println();
        for(int p:padded){
            System.out.print(p+" ");
        }
        int res=Arrays.mismatch(x,z);
        
        System.out.println(res);
    }
}
