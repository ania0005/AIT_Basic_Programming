package set.task1;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

        set.add("CCC");
        set.add("AAA");
        set.add("DDD");
        set.add("BBB");
         //не добавляет дубликаты
        set.add("CCC");

        // не может содержать null
        //set.add(null);

            System.out.println(set);
        boolean result = set.add("EEE");
        if (result){
            System.out.println("Added");
        } else System.out.println("No added");
        System.out.println(set);

        int lineNumber = 1;
        for (String currentValue : set) {
            System.out.println(lineNumber + ". " + currentValue);
            lineNumber++;
        }
        System.out.println("Contain BBB - " + set.contains("BBB"));
        System.out.println("Contain GGG - " + set.contains("GGG"));

        System.out.println(set.first());
        System.out.println(set.last());

        result = set.remove("BBB");
        System.out.println("Delete BBB - " + result);
        System.out.println(set);
    }
}
