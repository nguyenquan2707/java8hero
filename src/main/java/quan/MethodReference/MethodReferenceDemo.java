package quan.MethodReference;

import java.util.*;
import java.util.function.Function;

@FunctionalInterface
interface Printable {

    void print(String message);
}

public class MethodReferenceDemo {

    public void display(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        Function<Integer, Double> lambda = (data) -> Math.sqrt(data);

        System.out.println(lambda.apply(11));

        //covert to method reference
        Function<Integer, Double> lambda2 = Math::sqrt;
        System.out.println(lambda2.apply(11));

        //2.
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        Printable printable = (message -> System.out.println(message));
        printable.print("Quan.");

        Printable printableMethodReference = System.out::println;
        printableMethodReference.print("Quan from method reference.");

        //3.
        Function<String, String> stringFunction = (message) -> message.toLowerCase();
        System.out.println(stringFunction.apply("Quan"));
        Function<String, String> stringFunctionRef = String::toLowerCase;
        System.out.println(stringFunctionRef.apply("Quan"));

//        4.

        String[] strArray = {"A", "B", "Z", "D", "N", "C"};

        Arrays.sort(strArray, (o1, o2) -> o1.compareToIgnoreCase(o2));

        print(strArray);

        String[] strArray2 = {"A", "B", "Z", "D", "N", "C"};
        Arrays.sort(strArray2, String::compareToIgnoreCase);
        print(strArray2);

        /**
         * Constructor
         */
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Lemon");
        fruits.add("Apple");

        Function<List<String>, Set<String>> convert = (first) -> new HashSet<>(first);
        printSet(convert.apply(fruits));

        //new
        Function<List<String>, Set<String>> convert2 = HashSet::new;
        printSet(convert2.apply(fruits));
        boolean isSet = convert2.apply(fruits) instanceof HashSet<String>;
        System.out.println("isSet = " + isSet);

    }

    private static void printSet(Set<String> input) {
        System.out.println("---------------");
        input.stream().forEach(element -> {
            System.out.println(element + " ");
        });
    }

    private static void print(String[] array) {
        Arrays.asList(array).forEach(System.out::println);
    }
}
