import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class Hw1{

    //Задачи на копирование массивов:
    //Обратный массив: Напишите программу, которая создает новый массив, содержащий элементы исходного массива в обратном порядке,
    // используя System.arraycopy().
    //Слияние массивов: Напишите метод, который принимает два массива целых чисел и возвращает новый массив, который является
    // результатом их слияния. Используйте System.arraycopy().
    //Удаление дубликатов: Напишите программу, которая удаляет все дубликаты из отсортированного массива. Снова используйте System.arraycopy() для сдвига элементов.
    ////
    //Задачи на бинарный поиск: <T, C>
    //Поиск медианы: Создайте отсортированный массив случайных чисел. Напишите программу, которая находит медиану этого массива с помощью бинарного поиска.
    //
    //Медианой ряда чисел (или медианой числового ряда) называется число, стоящее посередине упорядоченного по возрастанию ряда чисел — в случае, если количество чисел нечётное. Если же количество чисел в ряду чётно, то медианой ряда является полусумма двух стоящих посередине чисел упорядоченного по возрастанию ряда.
    //
    //Пример 1. Найти медиану числового ряда 5, 17, 3, 9, 14, 2.
    //
    //Решение. Записываем все числа ряда в порядке возрастания: 2, 3, 5, 9, 14, 17. Количество чисел в ряду чётно, поэтому медиана этого ряда будет равна полусумме двух средних чисел: (5 + 9) / 2 = 7.
    //Пример 2. Найти медиану числового ряда 5, 2, 18, 8, 3.
    //
    //Решение. записываем все числа ряда в порядке возрастания: 2, 3, 5, 8, 18. Количество чисел в ряду нечётно, поэтому медиана этого ряда будет равна стоящему посередине числу, то есть равна 5.
    //Комплексная задача:
    //Сортировка и поиск в массиве студентов: Создайте класс Student с полями id, name и GPA (средний балл).
    //
    //Реализуйте метод, который сортирует массив студентов по GPA и использует System.arraycopy() для создания нового массива с топ-5 студентами.
    //Напишите метод, который принимает средний балл и находит студента с ближайшим средним баллом к данному, используя бинарный поиск.
    public static void main(String[] args) {


        int[] myArray = {10, 2, 3, 9, 5, 1, 7, 1, 9, 10};
        int[] myArray2 = {11,22,33,44,55,66,77,88};

        System.out.println("Исходный массив\n" + Arrays.toString(myArray) + "\n" +
                           "Обратный массив\n" + Arrays.toString(newArrayInReverseOrder(myArray)));
        System.out.println("__________________________________________________");
        System.out.println("Исходныe массивы\n" + Arrays.toString(myArray) + "\n" + Arrays.toString(myArray2) + "\n" +
                           "Cлияние массивов\n" + Arrays.toString(newArrayMerger(myArray, myArray2)));
        System.out.println("__________________________________________________");
        System.out.println("Исходный массив\n" + Arrays.toString(myArray) +  "\nМассив без дубликатов" +
                           Arrays.toString(arraywithoutDuplicate(myArray)));



    }
    //Задачи на копирование массивов:
    //Обратный массив: Напишите программу, которая создает новый массив, содержащий элементы исходного массива в обратном порядке,
    // используя System.arraycopy().
    public static int[] newArrayInReverseOrder(int[] array) {
        int[] result = new int[array.length];
       // System.arraycopy(array, 0, result, 0, array.length);
                int count = 0;
                for (int i = 1; i <= array.length; i++) {
                    result[count++] = array[array.length - i];
                }
                 return result;
    }
    //Слияние массивов: Напишите метод, который принимает два массива целых чисел и возвращает новый массив, который является
    //результатом их слияния. Используйте System.arraycopy().
    public static int[]  newArrayMerger (int[] array1, int [] array2) {
        int[] result = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
    //Удаление дубликатов: Напишите программу, которая удаляет все дубликаты из отсортированного массива.
    // Снова используйте System.arraycopy() для сдвига элементов.
       public static int[] arraywithoutDuplicate(int[] array) {
        Arrays.sort(array);
        int keyIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                keyIndex = i;
                int[] result = new int [array.length - 1];
                System.arraycopy(array, 0, result, 0, keyIndex);
                System.arraycopy(array, keyIndex + 1, result, keyIndex, array.length - keyIndex - 1);
                array = Arrays.copyOf(result, result.length);
               }
        }
        return array;
       }
}




