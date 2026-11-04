import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,5};
        int[] arr3={1,2,3,4};
        System.out.println(Arrays.mismatch(arr1,arr2));
        System.out.println(Arrays.mismatch(arr1,arr3));
        System.out.println(Arrays.mismatch(arr2,arr3));
    }
}
