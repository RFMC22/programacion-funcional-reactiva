package imperativevsdeclarative;

import java.util.stream.IntStream;

public class DeclarativeMain {
    public static void main(String[] args) {
        //declarativo o funcional
        int sumEvens = IntStream.rangeClosed(1, 100)
                                .filter(num -> num % 2 == 0)
                                .sum();
        System.out.println(sumEvens);
    }
}
