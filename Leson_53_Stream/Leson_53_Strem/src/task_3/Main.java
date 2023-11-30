package task_3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("D", "E", "F");
        List<String> list3 = List.of("G", "H", "I");

        List<List<String>> listOfLists = List.of(list1, list2, list3);

        // Преобразовать лcит листов в простой лист, содержащий все элементы

        System.out.println("На входе:");
        listOfLists.forEach(x -> System.out.println(x));

        List<String> result = listOfLists.stream() // сстрим листов
                .flatMap(x -> x.stream()) // стрим стрингов из трех стримов стрингов
                .collect(Collectors.toList());

        System.out.println("На выходе:");
        System.out.println(result);

        // Посчитать колличество элементов
    }
}
