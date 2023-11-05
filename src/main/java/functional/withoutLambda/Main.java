package functional.withoutLambda;

public class Main {
    public static void main(String[] args) {
        FirstRunnable runnable = new FirstRunnable();
        Thread thread          = new Thread(runnable);

        thread.start();

        //simulando expresion anonima
        Thread threadTwo = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("De esta forma se simulaba una expresion anonima");
                    }
                }
        );
        threadTwo.start();
    }
}
