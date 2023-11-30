package task_01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // преобразовать двухмерный массив в одномерный

        int[][] array = {{5, 9, 2},
                         {1, 3, 2, 9},
                         {6, 2}};
        int[] result = Arrays.stream(array)           // стрим одномерных массивов int[]
                .flatMapToInt(x -> Arrays.stream(x))  //стрим чисел объединенных в один стрим
                .toArray();
        System.out.println("Original data - " + Arrays.toString(array));
        System.out.println("Result - " + Arrays.toString(result));

        System.out.println("Вывод через стрим елементов двухмерного массива");
        Arrays.stream(array).forEach(x -> System.out.println(Arrays.toString(x)));
        }



}