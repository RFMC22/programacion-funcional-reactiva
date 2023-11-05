package practices.challengefour;

public class Main {
    public static void main(String[] args) {
        /*
        Metodo con multiples declaraciones
        Realizar un metodo similar con lambda
        public int length(String s){
            int l = s.length();
            System.out.print("Length of the String is: " + l);
            return l;
        }
        */
        MultipleStatements len = str -> {
            int l = str.length();
            System.out.println("Length of the String is: " + l);
            return l;
        };
        int length = len.length("Hello World!");
        System.out.println(length);
    }
}
