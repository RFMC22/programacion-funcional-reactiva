package practices.challengethree;

public class Main {
    public static void main(String[] args) {
        /*
        Metodo con parametros y retorno
        Realizar un metodo similar con lambda
        public int length(String s){
            return s.length();
        }
        */
        LengthString lengthString = text -> text.length();
        System.out.println(lengthString.length("lengthString"));
    }
}
