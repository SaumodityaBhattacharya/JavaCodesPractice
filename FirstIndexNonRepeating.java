import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="Recession";
        Map<Character, Integer> count=new HashMap<>();
        for(char c: s.toCharArray())
            count.put(c,count.getOrDefault(c,0)+1);

        for(int i=0;i<s.length();i++){
            if(count.get(s.charAt(i))==1)
                System.out.println(i);
        }
        System.out.println("Did not find any");
    }
}
