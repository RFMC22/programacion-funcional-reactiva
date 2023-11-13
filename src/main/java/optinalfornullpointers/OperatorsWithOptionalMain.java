package optinalfornullpointers;

import java.util.Optional;

public class OperatorsWithOptionalMain {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");

        //map() -> para transformar el valor
        String orElse = optional.map(val -> "Replaced").orElse("Empty");
        System.out.println(orElse);
        //filter() ->
        Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("Value"));
        System.out.println(filter.get());
        //flatMap() -> devuelve un Optinal
        Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaced"));
        System.out.println(flatMap.get());
        //ifPresent -> ejecuta un sonsumidor solo si existe el optional
        optional.ifPresent(System.out::println);
        //ifPresentOrElse -> ejecuta si existe o no el optional {a partir de java 9}
        //optional.ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));
        //stream -> si existe muestra contenido sino no muestra nada {a partir de java 9}
        //optional.stream().forEach(System.out::println);
        //or -> {a partir de java 9}
        //optional.or(() -> Optional.of("New Value")).ifPresent(System.out::println);
        //equals
        System.out.println(optional.equals(Optional.of("Value")));
        //hashCode
        System.out.println(optional.hashCode());
    }
}
