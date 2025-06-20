public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Mouse", "Electronics"),
            new Product(101, "Shirt", "Clothing"),
            new Product(105, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(104, "Book", "Stationery")
        };

        System.out.println("Linear Search:");
        Product found1 = Search.linearSearch(products, 104);
        System.out.println(found1 != null ? found1 : "Not found");

        System.out.println("\n Binary Search (after sorting):");
        Search.sortById(products);
        Product found2 = Search.binarySearch(products, 104);
        System.out.println(found2 != null ? found2 : "Not found");
    }
}
