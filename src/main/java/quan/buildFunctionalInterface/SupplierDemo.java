package quan.buildFunctionalInterface;

import java.util.function.Supplier;

class SupplierImpl implements Supplier<String> {

    @Override
    public String get() {
        return "Quan";
    }

}

class MethodReferenceSupplier {
    public static String get() {
        return "Quan from reference";
    }
}
public class SupplierDemo {

    public static void main(String[] args) {
        System.out.println(new SupplierImpl().get());

        Supplier<String> stringSupplier = () -> "Quan";
        System.out.println(stringSupplier.get());

        Supplier<String> reference = MethodReferenceSupplier::get;
        System.out.println(reference.get());
    }
}
