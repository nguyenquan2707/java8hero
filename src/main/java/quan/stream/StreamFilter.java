package quan.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {

    public static void main(String[] args) {
        List<Product> products = getProducts();
        System.out.println(products);

        products.stream().filter(product -> product.getPrice() > 1.1f)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static List<Product> getProducts() {

        return Arrays.asList(new Product(1, "A", 1.1f),
                new Product(1, "B", 1.1f),
                new Product(2, "D", 2.1f),
                new Product(3, "C", 3.1f),
                new Product(4, "Z", 4.1f));
    }
}

