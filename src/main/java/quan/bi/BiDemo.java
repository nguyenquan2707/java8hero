package quan.bi;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiDemo {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        BiFunction<Integer, Integer, Integer> biFunction2 = (integer, integer2) -> integer + integer2;

        System.out.println(biFunction.apply(1, 2));
        System.out.println(biFunction2.apply(1, 2));

        //andThen
        Function<Integer, Integer> doubleValue = new Function<>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };
        BiFunction<Integer, Integer, Integer> andThen = biFunction2.andThen(doubleValue);
        System.out.println("andThen = " + andThen.apply(1, 1));



    }
}
