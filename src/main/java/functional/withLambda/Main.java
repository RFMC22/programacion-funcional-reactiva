package functional.withLambda;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> System.out.println("Expresion lambda anonima")
        );
        thread.start();
    }
}
