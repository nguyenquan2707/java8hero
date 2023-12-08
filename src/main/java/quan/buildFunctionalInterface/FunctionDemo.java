package quan.buildFunctionalInterface;

import java.util.function.Function;

class A implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

class B {
    public static Integer convert(String value) {
        return value.length();
    }
}

public class FunctionDemo {


    public static void main(String[] args) {
        System.out.println(new A().apply("AAAA"));

        Function<String, Integer> function = s -> s.length();
        Function<String, Integer> methodReference = B::convert;

        System.out.println(function.apply("AAAA"));
        System.out.println("Method reference: " + methodReference.apply("BBBBBB"));
    }
}
