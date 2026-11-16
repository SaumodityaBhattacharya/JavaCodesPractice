import java.util.Arrays;
import java.util.Comparator;
public class SortOddEven {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4, 7, 6};

        int[] result = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator
                        .comparingInt((Integer n) -> n % 2 == 0 ? 0 : 1) 
                        .thenComparingInt(n -> n))
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}
