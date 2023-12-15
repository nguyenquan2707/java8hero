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

        //get
        optionalO.get();

        if(optionalO.isPresent()) {
            System.out.println("Not null + " + optionalO.get());
        }

        if(empty.isEmpty()) {
            System.out.println("Is Empty");
        }

        //orElse
        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional2.orElse("default@gmail.com"));

        //orElseGet
        Optional<Object> optional3 = Optional.ofNullable(null);
        System.out.println(optional3.orElseGet(() -> "default@gmail.com"));

        Optional<String> optional4 = Optional.ofNullable("a@email.com");
        System.out.println(optional4.orElseGet(() -> "default@gmail.com"));

        //orElseThrow
        Optional<String> optional5 = Optional.ofNullable("q@email.com");
        String orElseThrow = optional5
                .orElseThrow(() -> new IllegalArgumentException("Email not existed."));
        System.out.println("orElseThrow:" + orElseThrow);

        /*Optional<String> optional6 = Optional.ofNullable(null);
        String orElseThrow2 = optional6
                .orElseThrow(() -> new IllegalArgumentException("Email not existed."));
        System.out.println("orElseThrow" + orElseThrow);*/

        //ifPresent
        Optional<String> optional7 = Optional.of("have");
        Optional<String> optional8 = Optional.empty();

        optional7.ifPresent((data) -> System.out.println("Have value"));
        optional8.ifPresent((data) -> System.out.println("No value "));

        //filter
        String name = "myName";
        if(name != null && name.equals("myName")) {
            System.out.println("Name = " + name);
        }

        Optional<String> optional9 = Optional.ofNullable(name);
        optional9.filter(data -> data.equals("myName"))
                .ifPresent((finalResult) -> System.out.println("filter = " + finalResult));
    }
}
