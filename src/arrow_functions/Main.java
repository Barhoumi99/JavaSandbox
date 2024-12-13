package arrow_functions;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99, 10));
        products.add(new Product("Smartphone", 699.99, 15));
        products.add(new Product("Headphones", 199.99, 25));
        products.add(new Product("Monitor", 249.99, 8));
        products.add(new Product("Keyboard", 49.99, 30));
        products.add(new Product("Mouse", 29.99, 40));
        products.add(new Product("Printer", 149.99, 12));
        products.add(new Product("Webcam", 89.99, 20));
        products.add(new Product("External Hard Drive", 129.99, 18));
        products.add(new Product("Router", 79.99, 22));

        System.out.println(ANSI.GREEN + "Initialised at : " + ANSI.RESET + products);
        System.out.println("Filtered <= 15 : " + ProductManager.filterLowStock(products, 15));
        ProductManager.sortByPrice(products);
        System.out.println("Sorted by price : " + products);
        ProductManager.increasePrices(products, 23);
        System.out.println("added 23% to all prices : " + products);

    }
}
