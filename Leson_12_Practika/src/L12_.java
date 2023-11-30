import java.util.Arrays;

public class L12_ {
    public static void main(String[] args) {
        int[] array = {-4, -3, 1, 4, -3};
        System.out.println(Arrays.toString(array));
        int deleteIndex = 3;
        array[deleteIndex] = 0;
        System.out.println("Число с индексом " + deleteIndex + " было удалено " + Arrays.toString(array));

        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                array[j] = 0;
            }
        }
        System.out.println("Обновленный массив БЕЗ отрицательных чисел " + Arrays.toString(array));
    }
}