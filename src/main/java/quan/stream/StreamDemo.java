package quan.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        Stream<Character> stream = Stream.of('a', 'b', 'c', 'd');
        stream.forEach(System.out::println);

        //Create stream from collection
        Collection<String> list = Arrays.asList("A", "B", "C", "D");

        System.out.println("------");
        Stream<String> streamed = list.stream();
        streamed.forEach(System.out::println);

        //From list
        List<String> stringList = Arrays.asList("A", "B", "C", "D");
        Stream<String> streamed1 = stringList.stream();
        streamed1 .forEach(System.out::println);

        System.out.println("-----------");
        //From set
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        Stream<String> streamed2 = hashSet.stream();
        streamed2.forEach(System.out::println);

        //From Array
        String[] array = new String[3];
        array[0] = "A";
        array[1] = "B";
        array[2] = "C";

        System.out.println("------------Array----");
        Stream<String> streamed3 = Arrays.stream(array);
        streamed3.forEach(System.out::println);


    }
}
