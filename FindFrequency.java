import java.util.*;
class Main {
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("apple","mango","cherry","banana","apple");
        Map<String,Integer> hmap=new HashMap<>();
        for(String f:fruits){
            hmap.put(f,hmap.getOrDefault(f,0)+1);
        }
        System.out.println(hmap);
    }
}
