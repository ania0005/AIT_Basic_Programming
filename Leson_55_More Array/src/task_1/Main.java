package task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[4][5];
        int[][] array1 = new int[3][];

        System.out.println(Arrays.toString(array1));
        array1[0] = new int[5];
        array1[1] = new int[3];
        array1[2] = new int[7];

        for (int[] innerAray : array1) {
            for (int value : innerAray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        //Задача. Задать значение ячейки = индекс строки + индекс столбца
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = i + j;
            }
        }
        for (int[] innerAray : array1) {
            for (int value : innerAray) {
                System.out.print(value + " ");
            }
            System.out.println();


        }
    }
}