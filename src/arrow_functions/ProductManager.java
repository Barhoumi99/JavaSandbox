package arrow_functions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductManager {
    public static void increasePrices(List<Product> products, double percentage) {
        products.forEach(product -> product.setPrice(product.getPrice() * (100 + percentage) / 100));
    }

    public static List<Product> filterLowStock(List<Product> products, int threshold) {
        return products.stream().filter(product -> product.getQuantity() <= threshold).collect(Collectors.toList());
    }
    public static void sortByPrice(List<Product> products) {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }
}
