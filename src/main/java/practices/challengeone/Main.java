package practices.challengeone;

public class Main {
    public static void main(String[] args) {
        /*
        Realizar el siguiente metodo (sin retorno) pero con lambda
        public void myName(){System.out.print("Jhon")}
        */
        Name person = () -> System.out.println("Jhon");
        person.myName();
    }
}
