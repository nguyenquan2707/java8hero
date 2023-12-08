package quan.buildFunctionalInterface;

import quan.MyFunctionInterface;

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

    public static void print(String message, String message2) {
        System.out.println(message + " - " + message2);
    }
}

@FunctionalInterface
interface MyFunctional {
    void print(String message, String message2);
}

public class ConsumerDemo {
    public static void main(String[] args) {
        new C().accept("Quan");

        Consumer<String> consumer = message -> System.out.println("Message: " + message);

        consumer.accept("Quan");

        //method reference can replace lambda to implement Consumer.
        Consumer<String> methodReference = D::print;
        methodReference.accept("Quan");

        MyFunctional myFunctionInterface = D::print;
        myFunctionInterface.print("Quan", "Tra");
    }
}
