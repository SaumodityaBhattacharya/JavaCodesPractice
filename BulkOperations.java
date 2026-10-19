import java.util.*;

class Main {
    public static void main(String[] args) {
        // Wrapped in ArrayList to allow remove/add operations
        List<String> Inventory = new ArrayList<>(Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Headphones"));
        List<String> Promotional = Arrays.asList("Mouse", "Keyboard", "Gaming Chair");
        List<String> Defective = new ArrayList<>(Arrays.asList("Monitor", "Headphones"));
        
        // Case 1
        List<String> promoInStock = new ArrayList<>(Promotional);
        promoInStock.retainAll(Inventory);
        System.out.println(promoInStock); 
        
        // Case 2
        Inventory.removeAll(Defective);
        System.out.println(Inventory); 

        //Case 3
        List<String> CustomerOrder=Arrays.asList("Laptop","Mouse");
        boolean canFulfill=Inventory.containsAll(CustomerOrder);
        System.out.println(canFulfill);
    }
}
