import java.util.Arrays;
import java.util.List;
class Main {
    //LowerBound
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(2,3,4,5);
        List<Double> l2=Arrays.asList(3.1,4.5,2.5,5.5);
        writeOnlyIntegerClass(l1);
    }

        public static void writeOnlyIntegerClass(List<? super Integer> list){
            System.out.println(list);
        }
        
}
