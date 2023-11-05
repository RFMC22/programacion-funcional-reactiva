package functional.funcInterface;

public class Main {
    public static void main(String[] args) {
        //NOTA: para usar lambda necesitamos interfaces funcionales
        FirstFuncInterface function = () -> System.out.println("llamando mi metodo myFirstMethod");
        function.myFirstMethod();
    }
}
