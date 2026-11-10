import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] strs={"abc","bca", "cab","ccb", "bcc", "bbc", "aab", "bcb"};
        List<List<String>> ans=groupAnagrams(strs);
        System.out.println(ans);
    }
    public static List<List<String>> groupAnagrams(String[] str){
        if(str==null || str.length==0) //Edge cases
            return new ArrayList<>();

        Map<String, List<String>> freq=new HashMap<>();
        for(String s: str){
            String freqString=getFrequencyString(s);
            if(freq.containsKey(freqString)){
                freq.get(freqString).add(s);
            }
            else{
                List<String> strList=new ArrayList<>();
                strList.add(s);
                freq.put(freqString, strList);
            }
        }
        return new ArrayList<>(freq.values());
    }
    public static String getFrequencyString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int c : count) {
            sb.append('#').append(c);
        }
        return sb.toString();
    }
}
