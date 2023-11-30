package HomeWork;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main  {

    public static void main(String[] args) {

        List<String> numbers = List.of("10", "20", "10300", "10", "100", "50");
        System.out.println("На входе:");
        System.out.println(numbers);

        // 1.Подсчитать количество элементов, содержащих подстроку "10"
        long result = numbers.stream()
                .filter(x -> x.contains("10"))
                .count();
        System.out.println("Количество элементов, содержащих подстроку \"10\" - " + result);


        // 2. Отсортировать лист в алфавитном порядке
        List<String> result1 = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Отсортировать лист в алфавитном порядке - " + result1);


        // 3. Отсортировать лист в математическом порядке по возрастанию
        String result2 = String.valueOf(numbers.stream()
                .map(x -> Integer.parseInt(x))
                .sorted()
                .collect(Collectors.toList()));
        System.out.println("Отсортированый лист в математическом порядке по возрастанию - " + result2);


        // 4. Найти максимальное число
        int result3 = numbers.stream()
                .map(x -> Integer.parseInt(x))
                .max((a, b) -> a - b )
                .get();
        System.out.println("Mаксимальное число - " + result3);
    }

}
