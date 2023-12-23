package quan.bi;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        //normal
        new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                System.out.println("sum = " + integer + integer2);
            }
        }.accept(1,1);

        //lambda
        BiConsumer<Integer, Integer> biConsumer =
                (integer, integer2) -> System.out.println("sum = " + integer + integer2);
        biConsumer.accept(1,1);
    }
}
