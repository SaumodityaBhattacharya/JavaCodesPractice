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
            String sortedKey=getSortedString(s);
            if(freq.containsKey(sortedKey)){
                freq.get(sortedKey).add(s);
            }
            else{
                List<String> strList=new ArrayList<>();
                strList.add(s);
                freq.put(sortedKey, strList);
            }
        }
        return new ArrayList<>(freq.values());
    }
    public static String getSortedString(String s) {
    char[] charArray = s.toCharArray();
    Arrays.sort(charArray);
    return new String(charArray);
}
}
