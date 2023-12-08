package quan.buildFunctionalInterface;

import java.util.function.Consumer;

class C implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("Message: " + s);
    }
}

class D {
    public static void print(String message) {
        System.out.println("Message : " + message);
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {
        new C().accept("Quan");

        Consumer<String> consumer = message -> System.out.println("Message: " + message);

        consumer.accept("Quan");

        //method reference can replace lambda to implement Consumer.
        Consumer<String> methodReference = D::print;
        methodReference.accept("Quan");
    }
}
