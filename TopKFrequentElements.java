//First Approach using Maxheap
import java.util.*;
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        } 
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );


        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            maxHeap.add(entry);
        }

    
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(solver.topKFrequent(nums, k))); 
    }
}
// Second Approach using Bucket Sort(the best one)
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> bucket=new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            bucket.add(new ArrayList<>());
        }
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();
            bucket.get(freq).add(element);
        }
        
        List<Integer> resultList = new ArrayList<>();
        for (int i = n; i >= 0 && resultList.size() < k; i--) {
            if (bucket.get(i).isEmpty()) {
                continue;
            }
            for (int element : bucket.get(i)) {
                resultList.add(element);
                if (resultList.size() == k) {
                    break;
                }
            }
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 5,5,5,5, 2, 3, 1, 2};
        int k = 2;
        
        Solution sol = new Solution();
        int[] res = sol.topKFrequent(arr, k);
        
        System.out.println(Arrays.toString(res));
    }
}
