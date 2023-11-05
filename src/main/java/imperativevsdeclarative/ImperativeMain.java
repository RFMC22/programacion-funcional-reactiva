package imperativevsdeclarative;

public class ImperativeMain {
    public static void main(String[] args) {
        /*
        # PROBLEMA
        Se tiene una lista de 0 al 100 y necesitamos la suma de todos los números pares
        */

        int sumEvens = 0;
        for (int i = 1; i <= 100; i++ ){
            if (i%2 == 0) sumEvens += i;
        }
        System.out.println(sumEvens);
    }
}
