package task_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Сложить (склеять) все елементы листа
        List<String> numbers = List.of("10", "20", "30", "10", "100", "50" );
        String result = numbers.stream()
                .reduce((x, y) -> x +y)
                .orElse("");
        System.out.println("Result - " + result);

        // Получить сумму чисел матаматически:
        // Преобразовать строки в числа, сложить их матем.
        // результат преобразовать в строку

        String result1 = String.valueOf(numbers.stream()// stream строк
                .map(x -> Integer.parseInt(x))
                .reduce((x, y) -> x+y)
                .orElse(0));
        System.out.println("Result - " + result1);

        // Найти количество элементов, которые меньше 50

        long result2 = numbers.stream() // стрим строк "10", "20", "30", "10", "100", "50"
                .map(x -> Integer.parseInt(x)) // стрим чисел 10, 20, 30, 10, 100, 50
                .filter(x -> x < 50) // стрим чисел 10, 20, 30, 10
                .count(); // 4

        System.out.println("Result - " + result2);




    }
}
