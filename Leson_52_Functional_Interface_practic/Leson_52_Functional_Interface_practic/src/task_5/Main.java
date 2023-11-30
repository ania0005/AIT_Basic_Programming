package task_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Написать метод, который принимает на вход массив и функцию,
        // обрабатывает каждый элемент массива при помощи переданной функции
        // и создаёт сет получившихся элементов

        // [AAA, BBB, CCC, AAA]
        String[] array = {"AAA", "BBB", "CCC", "AAA"};
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));

        // [AAA, BBB, CCC, AAA] -> Set [AAAAAA, BBBBBB, CCCCCC]
        Set<String> result = getSetFromArray(array, x -> x + x);
        System.out.println(result);

        // [AAA, BBB, CCC, AAA] -> Set[AAA - 3, BBB - 3, CCC - 3]
        result = getSetFromArray(array, x -> x + " - " + x.length());
        System.out.println(result);

        // [AAA, BBB, CCC, CCC] -> Set[AAA, BBB, CCC]
        result = getSetFromArray(array, Function.identity());
        System.out.println(result);
    }

    public static Set<String> getSetFromArray(String[] array, Function<String, String> function) {
Set<String> result = new HashSet<>();
for (String currentValue : array){
    String processedValue = function.apply(currentValue);
    result.add(processedValue);
}
return result;
    }

}