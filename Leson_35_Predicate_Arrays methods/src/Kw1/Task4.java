package Kw1;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task4 {
    //Создайте обобщенный метод filterArray, который принимает массив и предикат. Метод должен вернуть новый массив,
    // в котором останутся только элементы, удовлетворяющие условию предиката.
    //Сигнатура метода может выглядеть так: <T> T[] filterArray(T[] array, Predicate<T> predicate)
    //Создайте два разных массива для тестирования: один с целыми числами и один со строками.
    //Например, массив целых чисел [1, 2, 3, 4, 5] и массив строк ["apple", "banana", "cherry"].
    //Определите предикаты для каждого типа массивов:
    //Для массива чисел предикат, который фильтрует четные числа.
    //Для массива строк предикат, который фильтрует строки, начинающиеся на определенную букву (например, "a").
    //Примените filterArray к каждому из массивов, используя определенные предикаты.
    //Выведите результаты на экран.
    public static void main(String[] args) {

        Integer[] myArray = {4, 5, 6, 7, 8, 9, 4, 5, 6, 7, 8, 0};

        Predicate<Integer> isEven = A -> A % 2 == 0;

        String[] stringArray = {"apple", "banana", "cherry", "strawberry", "pear", "melon"};

        Predicate<String> startsWithA = (s) -> s.startsWith("s");

        filterArray(myArray, isEven);
        filterArray(stringArray, startsWithA);


    }

    public static <T> T[] filterArray(T[] array, Predicate<T> predicate) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i])) {
                counter++;
            }
        }
        //T[] resultArray = (T[])(new Object[counter]);
        T[] resultArray = Arrays.copyOf(array, counter);
        for (int i = 0, j = 0; j < resultArray.length; i++) {
            if (predicate.test(array[i])) {
                resultArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(resultArray));
        return resultArray;
    }
}

