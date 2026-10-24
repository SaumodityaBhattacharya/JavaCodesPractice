import java.util.*;
class Main {
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> seen=new HashSet<>();
        for(int num:arr){
            if(!seen.add(num))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4};
        int[] nums={1,2,3,4,5};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(nums));
    }
}
