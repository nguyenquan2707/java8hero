package quan.buildFunctionalInterface;

import java.util.function.BiFunction;

class BiFunctionImpl implements BiFunction<String, Integer, Integer> {

    @Override
    public Integer apply(String s, Integer integer) {
        return s.length() + integer;
    }
}

class BiFunctionReference {
    public static Integer cal(String name, Integer number) {
        return name.length() + number;
    }
}
public class BiFunctionDemo {

    public static void main(String[] args) {

        System.out.println(new BiFunctionImpl().apply("Quan", 12));

        BiFunction<String, Integer, Integer> biFunction = (name, number) -> name.length() + number;
        System.out.println(biFunction.apply("Quan", 12));

        BiFunction<String, Integer, Integer> biFunctionRef = BiFunctionReference::cal;

        System.out.println(biFunctionRef.apply("Quan", 12));

    }
}
