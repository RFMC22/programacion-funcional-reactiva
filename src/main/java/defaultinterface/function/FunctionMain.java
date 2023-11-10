package defaultinterface.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kit", "Kat", "Shake");
        Function<String, Integer> function = e -> e.length();
        System.out.println(function.apply("Hello World!"));

        List<Integer> newList = map(list, function);
        System.out.println(newList);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> newList = new ArrayList<>();
        for (T element: list) {
            newList.add(function.apply(element));
        }
        return newList;
    }
}
