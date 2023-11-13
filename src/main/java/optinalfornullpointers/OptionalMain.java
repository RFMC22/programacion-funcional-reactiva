package optinalfornullpointers;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        String val = "Es un string";
        Optional<String> optinal = Optional.of(val);

        //vacio
        Optional<Integer> empty = Optional.empty();

        //nullable
        Optional<String> nullable = Optional.ofNullable(val);

    }
}
