import java.util.*;
    class Main {
    public static void main(String[] args) {
        List<String> Inventory=Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Headphones");
        List<String> Promotional=Arrays.asList("Mouse", "Keyboard", "Gaming Chair");
        List<String> Defective=new ArrayList<>(Arrays.asList("Monitor", "Headphones"));

        //Case 1
        List<String> promoInStock=new ArrayList<>(Promotional);

        promoInStock.retainAll(Inventory);
        System.out.println(promoInStock);
        
    }
}
