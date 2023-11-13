package optinalfornullpointers;

import java.util.Optional;

public class GetOptionalMain {
    public static void main(String[] args) {
        Integer num = 10;
        Optional<Integer> optionalNum = Optional.of(num);

        //obtener
        Integer integerVal = optionalNum.get();
        System.out.println(integerVal);

        //evitar excepcion
        Optional<Integer> emptyOptional = Optional.empty();

        //IsPresent forma larga
        Integer val = emptyOptional.isPresent() ? emptyOptional.get() : 0;
        System.out.println(val);

        //orElse forma corta
        Integer orElse = emptyOptional.orElse(0);
        System.out.println(orElse);

        //orElseGet forma corta
        Integer orElseGet = emptyOptional.orElseGet(() -> 0);
        System.out.println(orElseGet);

        //orElseThrow si aun asi quieres brindar una excepcion
        Integer orElseThrow = emptyOptional.orElseThrow(IllegalArgumentException::new);
        System.out.println(orElseThrow);
    }
}
