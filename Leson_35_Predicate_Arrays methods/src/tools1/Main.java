import tools.ArrayTools;
import java.util.Arrays;
import java.util.function.Predicate;

import static tools.ArrayTools.*;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */


//Задание 4: Обобщенный метод с предикатами
//        Создайте обобщенный метод filterArray, который принимает массив и предикат. Метод должен вернуть новый массив,
//        в котором останутся только элементы, удовлетворяющие условию предиката.
//        Сигнатура метода может выглядеть так: <T> T[] filterArray(T[] array, Predicate<T> predicate)
//        Создайте два разных массива для тестирования: один с целыми числами и один со строками.
//        Например, массив целых чисел [1, 2, 3, 4, 5] и массив строк ["apple", "banana", "cherry"].
//        Определите предикаты для каждого типа массивов:
//        Для массива чисел предикат, который фильтрует четные числа.
//        Для массива строк предикат, который фильтрует строки, начинающиеся на определенную букву (например, "a").
//        Примените filterArray к каждому из массивов, используя определенные предикаты.

//        Выведите результаты на экран.
//        Ожидаемый результат
//        На экране должны быть выведены отфильтрованные массивы: один с числами, которые удовлетворяют предикату,
//        и один со строками, которые удовлетворяют предикату.
//
//        Будьте внимательны с типами данных. Обобщенный метод должен работать с массивами любого типа данных.
public class Main {

    public static void main(String[] args) {
        Integer[] integers = {6, 1, 2, 3, 4, 5};
        String[] strings = {"apple", "banana", "cherry"};

        Predicate<Integer> integerPredicate = number -> number % 2 == 0;
        Predicate<String> stringPredicate = text -> text.startsWith("a");

        Integer[] resultIntegers = filterArray(integers, integerPredicate);
        String[] resultStrings = filterArray(strings, stringPredicate);

        print(resultIntegers);
        System.out.println();
        print(resultStrings);

        System.out.println(search(strings, "wien"));
    }

    private static <T> T[] filterArray(T[] array, Predicate<T> predicate) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i])) {
                counter++;
            }
        }

        // вернуть отфильтрованный массив только с теми элементами которые удовлетворяют требованиям предиката
        T[] result = Arrays.copyOf(array, counter);

        for (int i = 0, j = 0; j < result.length; i++) {
            if (predicate.test(array[i])) {
                result[j++] = array[i];
            }
        }
        return result;
    }
}


