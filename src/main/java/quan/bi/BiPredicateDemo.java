package quan.bi;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {
        boolean tested = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.length() > s2.length();
            }
        }.test("AA", "A");
        System.out.println("tested= " + tested);

        BiPredicate<String, String> biPredicate = (s, s2) -> s.length() > s2.length();
        System.out.println(biPredicate.test("aa","a"));

        //and
        BiPredicate<Integer, Integer> biPredicate2 = (integer, integer2) -> integer > integer2;
        BiPredicate<Integer, Integer> biPredicate3 = (integer, integer2) -> integer == integer2;
        boolean multiTested = biPredicate2.and(biPredicate3).test(2, 2);
        System.out.println("multiTested = " + multiTested);

        //or
        BiPredicate<Integer, Integer> biPredicate4 = (integer, integer2) -> integer > integer2;
        BiPredicate<Integer, Integer> biPredicate5 = (integer, integer2) -> integer == integer2;
        System.out.println("or = " + biPredicate4.or(biPredicate5).test(4, 3));

        //negate
        BiPredicate<Integer, Integer> biPredicate6 = (integer, integer2) -> integer > integer2;
        boolean negate = biPredicate6.negate().test(2, 1);
        System.out.println("negate=" + negate);

    }
}
