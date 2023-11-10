package defaultinterface.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> new String("un string");
        System.out.println(supplier.get());

        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println(randomNumber.get());
    }
}
