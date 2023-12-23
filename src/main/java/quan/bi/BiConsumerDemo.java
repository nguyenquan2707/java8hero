package quan.bi;

import java.util.HashMap;
import java.util.Map;
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

        //BiConsumer with Map
        Map<String, String> map = new HashMap<>();
        map.put("A", "AA");
        map.put("B", "BB");
        map.put("C", "CC");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println("key= " + key + ",value=" + value);
            }
        });

        map.forEach((key, value) -> System.out.println("key= " + key + ",value=" + value));
    }
}
