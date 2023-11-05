package practices.challengetwo;

public class Main {
    public static void main(String[] args) {
        /*
        Realizar el siguiente metodo (sin retorno) con parametros
        utilizando lambda
        public void operation(int a, int b){System.out.print(a+b)}
        */
        Operations add = (a, b) -> System.out.println(a + b);
        add.operation(10, 5);

        Operations multiply = (a, b) -> System.out.println(a * b);
        multiply.operation(2, 10);

        Operations divide = (a, b) -> System.out.println(a / b);
        divide.operation(10, 5);

        Operations subtract = (a, b) -> System.out.println(a - b);
        subtract.operation(2, 10);
    }
}
