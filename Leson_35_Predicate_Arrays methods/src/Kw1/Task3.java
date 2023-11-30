package Kw1;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task3 {
    //Создайте массив целых чисел (например, [1, 4, 5, 12, 15, 22]).
    //Определите два предиката: один для фильтрации четных чисел и один для чисел, больших 10.
    //Создайте композицию этих предикатов, используя методы and(), or() и negate().
    //Пройдите по массиву и примените каждую композицию предикатов.
    //Выведите числа, которые удовлетворяют каждой композиции предикатов, на экран.
    public static void main(String[] args) {

        Integer[] myArray = {1, 4, 5, 12, 15, 22, 14, 9, 11, 8};

        Predicate<Integer> isEven = element -> element % 2 == 0;
        Predicate<Integer> isMore10 = element -> element > 10;
        int counter = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (isEven.test(myArray[i]) && isMore10.test(myArray[i])) { //  Predicate.and()
                counter++;
            }
        }
        Integer[] resultArray = new Integer[counter];
        for (int i = 0, j = 0; j < resultArray.length; i++) {
            if (isEven.test(myArray[i]) && isMore10.test(myArray[i])) {
                resultArray[j] = myArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
