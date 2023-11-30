package task_01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 7, 1, 8, 0, 11, 9, 7);
        // Получить из листа коллекцию нечетных чисел без дубликатов

        // 1 variant
        Set<Integer> set = new HashSet<>();
        for (Integer current : numbers) {
            if (current % 2 != 0) {
                set.add(current);
            }
        }
        System.out.println("Исходный лист - " + numbers);
        System.out.println("Result - " + set);

        // 2 variant with Stream
        Set<Integer> result = numbers.stream() //stream 2, 7, 1, 8, 0, 11, 9, 7
                .filter(x -> x % 2 != 0)       // stream 7, 1, 11, 9, 7 - конвеерный метод, промежуточный, может быть несколько
                .collect(Collectors.toSet());  // stream 7, 1, 11, 9   - терминальный метод, финальный, только один
        System.out.println("Result-2 - " + result );

        // Получить сумму всех нечетных елементов листа
        // 1 variant
        int sum = 0;
        for (Integer current : numbers) {
            if (current % 2 != 0) {
                sum += current;
            }
        }
        System.out.println("Исходный лист - " + numbers);
        System.out.println("Cумму всех нечетных елементов - " + sum);

        // 2 variant with Stream
        int sum1 = numbers.stream() //stream 2, 7, 1, 8, 0, 11, 9, 7
                .filter(x -> x % 2 != 0)
                .reduce((x, y) -> x + y)
                .orElse(-1);
        System.out.println("Cумму всех нечетных елементов - " + sum1);

    }
}