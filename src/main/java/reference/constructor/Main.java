package reference.constructor;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Thread::new sería la referencia por constructor
        Function<Runnable, Thread> threadGenerator = Thread::new;

        Runnable taskOne = () -> System.out.println("Task 1 executed");
        Runnable taskTwo = () -> System.out.println("Task 2 executed");

        Thread threadOne = threadGenerator.apply(taskOne);
        Thread threadTwo = threadGenerator.apply(taskTwo);

        threadOne.start();
        threadTwo.start();
    }
}
