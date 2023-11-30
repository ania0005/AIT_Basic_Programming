import java.util.Arrays;

//Задача 3 Частотный анализ
////Программа должна подсчитать, сколько раз
// каждое число встречается в массиве и вывести результат в коноль.
  public class L12_2 {
    public static void main(String[] args) {
        int[] array = {-4, -3, 1, 4, -3};
      /*  for (int i = 0; i < array.length; i++) {
            array[i] = randInt(-5, 5);
        } */
        System.out.println(Arrays.toString(array));
        int deleteIndex = 3;
        array[deleteIndex] = 0;
        // Удалили значение 3й ячейки.
        System.out.println("Число с индексом " + deleteIndex + " было удалено " + Arrays.toString(array));

        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                array[j] = 0;
            }
        }
        System.out.println("Обновленный массив БЕЗ отрицательных чисел " + Arrays.toString(array));
    }
      /*  public static int randInt(int min, int max) {
            Random rand = new Random();
            return rand.nextInt((max - min) + 1) + min;} */

}
