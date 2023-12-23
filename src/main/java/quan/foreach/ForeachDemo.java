package quan.foreach;

import quan.stream.Product;

import java.util.Arrays;
import java.util.List;

public class ForeachDemo {

    public static void main(String[] args) {

        getProducts().forEach(System.out::println);

        getProducts().stream().forEach(System.out::println);

    }

    private static List<Product> getProducts() {

        return Arrays.asList(new Product(1, "A", 1.1f),
                new Product(2, "B", 1.2f),
                new Product(3, "D", 2.1f),
                new Product(4, "C", 3.1f),
                new Product(5, "Z", 4.1f));
    }
}
