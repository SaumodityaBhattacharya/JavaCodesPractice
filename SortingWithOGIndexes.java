import java.util.*;
class Solution {
    public ArrayList<ArrayList<Integer>> sortWithIndices(int[] arr) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> pair=new ArrayList<>();
            pair.add(arr[i]); //Value
            pair.add(i); //index
            result.add(pair);
        }
        result.sort(Comparator.comparingInt(a->a.get(0)));
        return result;
    }
    public static void main(String[] args){
        int[] arr={40,10,50,20,30};
        Solution sol=new Solution();
        ArrayList<ArrayList<Integer>> res=sol.sortWithIndices(arr);
        System.out.println(res);
    }
}
