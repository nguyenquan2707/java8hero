package quan.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "z", "h", "i");


        List<String> collect = list.stream().sorted().collect(Collectors.toList());

        System.out.println(collect);

        //
        List<String> collect1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
