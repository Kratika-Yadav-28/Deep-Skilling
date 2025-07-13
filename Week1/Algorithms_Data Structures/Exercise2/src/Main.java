import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shampoo", "Personal Care"),
                new Product(103, "Shoes", "Footwear"),
                new Product(104, "Keyboard", "Electronics"),
                new Product(105, "Mobile", "Electronics")
        };

        System.out.println("=== Linear Search ===");
        Product result1 = SearchUtil.linearSearch(products, "Shoes");
        if (result1 != null) {
            System.out.println("Found: " + result1);
        } else {
            System.out.println("Product not found.");
        }

        //sorted array
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\n=== Binary Search ===");
        Product result2 = SearchUtil.binarySearch(products, "Shoes");
        if (result2 != null) {
            System.out.println("Found: " + result2);
        } else {
            System.out.println("Product not found.");
        }

        // Compare
        System.out.println("\n=== Search Comparison & Recommendation ===");
        System.out.println("Linear Search Time Complexity: O(n)");
        System.out.println("Binary Search Time Complexity: O(log n)");
        System.out.println("Binary Search is more efficient for large, sorted datasets.");
        System.out.println("➡ Recommendation: Use Binary Search if your product list is sorted.");
    }
}
