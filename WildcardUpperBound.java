import java.util.Arrays;
import java.util.List;
class Main {
    //UpperBound
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(2,3,4,5);
        List<Double> l2=Arrays.asList(3.1,4.5,2.5,5.5);
        System.out.println(sum(l1));
        System.out.println(sum(l2));
    }

        private static double sum(List<? extends Number> list){
            double dSum=0.0;
            for(Number i: list){
                dSum+=i.doubleValue();
            }
        return dSum;
        }
        
}
