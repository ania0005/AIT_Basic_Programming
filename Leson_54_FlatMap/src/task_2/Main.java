package task_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[][] array = {{"a", "b"},
                            {"c", "d", "e"},
                            {"g", "h", "i"}};

        // Вывести все елементымассива в одну строку, кроме "b"

        List<String> result = Arrays.stream(array)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> !x.equals("b"))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
