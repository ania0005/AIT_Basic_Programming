package Kw1;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task1 {
    //Создайте массив целых чисел (например, [1, 2, 3, 4, 5, 6]).
    //Определите предикат Predicate<Integer>, который будет проверять, является ли число четным.
    //Пройдите по массиву и используйте предикат для фильтрации, чтобы оставить только четные числа.
    //Выведите отфильтрованные числа на экран.

//
    public static void main(String[] args) {

        Integer[] myArray = {4, 5, 6, 7, 8, 9, 4, 5, 6, 7, 8, 9};

        Predicate<Integer> isEven = Array -> Array % 2 == 0;
        int counter = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (isEven.test(myArray[i])) {
                counter++;
            }
        }
        Integer[] resultArray = new Integer[counter];
        for (int i = 0, j = 0; j < resultArray.length; i++) {
            if (isEven.test(myArray[i])) {
                resultArray[j] = myArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}