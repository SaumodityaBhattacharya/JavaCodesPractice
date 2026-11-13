import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 8, 6, 0, 0, 9, 7, 8, 6, 12, 10, 16, 8, 0, 6, 10);
        
        // Map to store each number and its list of occurrences (indexes)
        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        
        for (int i = 0; i < numbers.size(); i++) {
            indexMap.computeIfAbsent(numbers.get(i), k -> new ArrayList<>()).add(i);
        }
        
        System.out.println("Duplicate Elements, Counts, and Indexes:");
        System.out.println("----------------------------------------");
        
        for (Map.Entry<Integer, List<Integer>> entry : indexMap.entrySet()) {
            List<Integer> indexes = entry.getValue();
            if (indexes.size() > 1) {
                System.out.println("Value: " + entry.getKey() + 
                                   " | Count: " + indexes.size() + 
                                   " | Indexes: " + indexes);
            }
        }
    }
}
