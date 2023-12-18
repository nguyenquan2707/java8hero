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

class Product {
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    private int id;
    private String name;

    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
