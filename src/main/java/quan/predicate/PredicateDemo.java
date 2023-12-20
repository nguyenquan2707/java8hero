package quan.predicate;

import java.util.Objects;
import java.util.function.BiPredicate;

public class PredicateDemo {

    public static void main(String[] args) {
        BiPredicate<String, Integer> filter = (x, y) -> x.length() == y;

        boolean result = filter.test("mkyong", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false

        System.out.println(
                isNotChange("A", "A" ,"B", "B")
        );
    }

    private static boolean isNotChange(String newEmail, String currentEmail,
                                       String newFpEmail, String currentFpEmail) {
        BiPredicate<String, String> biPredicate =
                (first, second) -> Objects.isNull(first) && Objects.isNull(second) ||
                first.equals(second);

        return biPredicate.test(newEmail, currentEmail)
                && biPredicate.test(newFpEmail, currentFpEmail) ;
    }
}
