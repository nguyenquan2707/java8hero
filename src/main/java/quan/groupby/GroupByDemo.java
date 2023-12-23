package quan.groupby;

import quan.stream.Product;

import java.util.Arrays;
import java.util.List;

public class GroupByDemo {

    public static void main(String[] args) {
        //anyMatch
        System.out.println(
                getProducts().stream()
                        .anyMatch(product -> product.getPrice() > 3.1f)
        );

        //all match
        System.out.println(
                getProducts().stream()
                        .allMatch(product -> product.getPrice() > 3.1f)
        );

        //none match
        System.out.println(
                getProducts().stream()
                        .noneMatch(product -> product.getPrice() > 5.1f)
        );



    }

    private static List<Product> getProducts() {
        return Arrays.asList(new Product(1, "A", 1.1f),
                new Product(2, "B", 1.2f),
                new Product(3, "D", 2.1f),
                new Product(4, "C", 3.1f),
                new Product(5, "Z", 4.1f));
    }
}
