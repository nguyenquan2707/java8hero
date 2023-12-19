package quan.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "z", "h", "i");


        List<String> collect = list.stream().sorted().collect(Collectors.toList());

        System.out.println(collect);

        //
        List<String> collect1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(collect1);

        //des
        list.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).forEach(System.out::print);

        System.out.println();
        list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList())
                .forEach(System.out::print);

        //sort product
        getProducts().stream()
                .sorted(((o1, o2) -> o1.getName().compareTo(o2.getName())))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
        getProducts().stream()
                .sorted(((o1, o2) -> o2.getName().compareTo(o1.getName())))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("----");
        getProducts().stream()
                .sorted((Comparator.comparing(Product::getName)))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("------");
        getProducts().stream()
                .sorted((Comparator.comparing(Product::getName).reversed()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("-------");
        getProducts().stream()
                .sorted((Comparator.comparingInt(Product::getId).reversed()))
                .collect(Collectors.toList())
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
