import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Bag", "Travel")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String searchName = sc.nextLine();

                // Linear Search
        Product foundLinear = Searching.linearSearch(products, searchName);
        if (foundLinear != null)
            System.out.println("Linear Search -->" + foundLinear);
        else
            System.out.println("Linear Search: Product not found.");

        // Binary Search
        Product foundBinary = Searching.binarySearch(products, searchName);
        if (foundBinary != null)
            System.out.println("Binary Search -->" + foundBinary);
        else
            System.out.println("Binary Search: Product not found.");

        sc.close();
    }
}
