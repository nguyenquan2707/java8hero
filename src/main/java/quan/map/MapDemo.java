package quan.map;

import quan.stream.Product;
import quan.stream.ProductDto;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {

        //Normal
        getProducts().stream()
                        .map(new Function<Product, ProductDto>() {
                            @Override
                            public ProductDto apply(Product product) {
                                return new ProductDto(product.getName(), product.getPrice());
                            }
                        })
                .collect(Collectors.toList())
                        .forEach(System.out::println);

        System.out.println("-------");

        //Lambda
        getProducts().stream()
                .map(product -> new ProductDto(product.getName(), product.getPrice()))
                .forEach(System.out::println);

    }

    private static List<Product> getProducts() {

        return Arrays.asList(new Product(1, "A", 1.1f),
                new Product(2, "B", 1.2f),
                new Product(3, "D", 2.1f),
                new Product(4, "C", 3.1f),
                new Product(5, "Z", 4.1f));
    }
}
