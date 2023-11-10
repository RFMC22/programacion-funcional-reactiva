package reference.method;

import java.util.function.Supplier;

public class ExampleSupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> new String("un string");
        System.out.println(supplier.get());

        //Math::random es el metodo referenciado
        Supplier<Double> randomNumber = Math::random;
        System.out.println(randomNumber.get());
    }
}
