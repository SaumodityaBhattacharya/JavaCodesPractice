import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "Madam";
        String t = "adamM";
        
        if (s.length() != t.length()) {
            System.out.println(false);
            return; 
        }
        
        int[] freq = new int[128];
        for (char c : s.toCharArray()) freq[c]++;
        for (char c : t.toCharArray()) freq[c]--;
        
        for (int x : freq) {
            if (x != 0) {
                System.out.println(false);
                return; 
            }
        }
        
        System.out.println(true);
    }
}
