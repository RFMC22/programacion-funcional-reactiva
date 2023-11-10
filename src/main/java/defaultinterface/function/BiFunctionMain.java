package defaultinterface.function;

import java.util.function.BiFunction;

public class BiFunctionMain {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (a, b) -> a + b;

        System.out.println(biFunction.apply("Hello ", "World!"));
    }
}
