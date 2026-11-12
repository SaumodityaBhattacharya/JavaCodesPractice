// Encoding and then decoding the string
import java.util.*;
class Codec{
    public String encode(String[] strs){
        StringBuilder out=new StringBuilder();
        for(String s: strs)
            out.append(s.length()).append('#').append(s);
            return out.toString();
        }
        public List<String> decode(String s){
            List<String> out =new ArrayList<>();
            int i=0;
            while(i<s.length()){
                int j=s.indexOf('#',i);
                int n =Integer.parseInt(s.substring(i,j));
                out.add(s.substring(j+1,j+1+n));
                i=j+1+n;
            }
          return out;
        }
    public static void main(String[] args){
        Codec cod=new Codec();
        String[] input={"Hello", "#Bitch"};
        String encoded=cod.encode(input);
        System.out.println("Encoded string is: "+ encoded);
        List<String> decodedList=cod.decode(encoded);
        System.out.println("Decoded String list is: "+decodedList);
    }
    }
