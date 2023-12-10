package quan.MethodReference;

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
    }
}
