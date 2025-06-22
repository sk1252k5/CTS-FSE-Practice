import java.util.HashMap;
public class Driver {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        

        Product p1 = new Product(101, "Laptop", 5, 70000);
        Product p2 = new Product(102, "Mouse", 20, 499);
        Product p3 = new Product(103, "Keyboard", 10, 1199);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.showInventory();

        inventory.updateProduct(102, 25, 599);
        inventory.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");
        inventory.showInventory();
    }
}
