package quan.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        //Create empty optional
        Optional<Object> empty = Optional.empty();

        System.out.println(empty);

        String email = "q@gmail.com";

        //Make sure that object always not null
        Optional<String> optionalS = Optional.of(email);
        System.out.println(optionalS);

        //Not sure that object is null or not, then using ofNullable
        Optional<Object> optionalO = Optional.ofNullable(email);
        System.out.println(optionalO);
    }
}
