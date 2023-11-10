package defaultinterface.genericinterface;

public class Main {
    public static void main(String[] args) {
        FunctionalGenerics<String, String> fun = str -> str.substring(1, 5);
        String subStr = fun.execute("Hello World!");
        System.out.println(subStr);

        FunctionalGenerics<Integer, String> fun2 = str -> str.length();
        int len = fun2.execute("Hello World!");
        System.out.println(len);
    }
}
