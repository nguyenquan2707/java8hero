package quan.find;

import quan.stream.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

    public static void main(String[] args) {

        //find first
        Optional<Product> optionalProduct = getProducts().stream()
                .findFirst();

        optionalProduct.ifPresent(System.out::println);

        //find any
        Optional<Product> product = getProducts().stream()
                .findAny();

        product.ifPresent(System.out::println);

        //max
        long count = getProducts().stream()
                .count();
        System.out.println(count);
    }

    private static List<Product> getProducts() {

        return Arrays.asList(new Product(1, "A", 1.1f),
                new Product(2, "B", 1.2f),
                new Product(3, "D", 2.1f),
                new Product(4, "C", 3.1f),
                new Product(5, "Z", 4.1f));
    }
}
