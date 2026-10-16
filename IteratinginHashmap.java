import java.util.Map;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        Map<String,String> capitalCity=new HashMap<>();
        capitalCity.put("Brazil","Brasilia");
        capitalCity.put("India","New Delhi");
        capitalCity.put("USA","Washington DC");
        capitalCity.put("Portugal","Lisbon");
        capitalCity.put("Spain","Madrid");
        //Using EntrySet()
        for(Map.Entry<String,String> entry: capitalCity.entrySet()){
            System.out.println("Country-"+entry.getKey()+" Capital-"+entry.getValue());
        }
        //Using keySet()
        for(String country:capitalCity.keySet()){
            System.out.println("Country: "+country);
        }
    }
}
