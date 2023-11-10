package defaultinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("");
        list.add("First");
        list.add("Second");
        list.add("");

        Predicate<String> predicate = str -> !str.isEmpty();

        List<String> newList = filterList(list, predicate);
        System.out.println(newList);
    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();
        for (String str: list) {
            if (predicate.test(str)) newList.add(str);
        }
        return newList;
    }
}
