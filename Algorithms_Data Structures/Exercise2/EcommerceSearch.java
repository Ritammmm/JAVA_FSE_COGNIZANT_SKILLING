public class EcommerceSearch {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(102, "Bag", "Fashion")

        };

        System.out.println("Linear Search Result");

        Product result1 = LinearSearch.linearSearch(products, 104);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        Product[] sortedProducts = {

                new Product(101, "Shoes", "Fashion"),
                new Product(102, "Bag", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Laptop", "Electronics")

        };

        System.out.println("\nBinary Search Result");

        Product result2 = BinarySearch.binarySearch(sortedProducts, 104);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }

    }
}