package set.task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {

    public static void main(String[] args) {

        String[] array = {"AAA", "BBB", "CCC", "DDD", "EEE", "BBB"};

        System.out.println("Original arrary");
        System.out.println(Arrays.toString(array));

        Set<String> set1 = new HashSet<>();
        for (String currentValue : array) {
            set1.add(currentValue);
        }
        System.out.println("Method 1: " + set1);

        Set<String> set2 = new HashSet<>(Arrays.asList(array));
        System.out.println("Method 2: " + set2);

        Set<String> set3 = new HashSet<>();
        Collections.addAll(set3, array);
        System.out.println("Method 3: " + set3);

        Set<String> set4 = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println("Method 4: " + set4);

        array[5] = "LLL";
        Set<String> set5 = Set.of(array);
        System.out.println("Method 5: " + set5);
    }
}
