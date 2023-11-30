//Задача 3 Частотный анализ
// Программа должна подсчитать, сколько раз каждое число встречается в массиве и вывести результат
// в консоль.


public class L12_1 {
    public static void main(String[] args) {
        int[] array = {-3, -2, -1, 0, 1, 2, 3, 0, 1, 2, 1, 2};

        for (int i = 0; i < array.length; i++) { // i = 0; 1
            int counter = 0;

            for (int j = 0; j < array.length; j++) { // j = 0; 1
                if (array[i] == array[j]) {
                    counter++;
//                    ++counter;
                }
            }
            System.out.println("Число " + array[i] + " встретилось " + counter + " раз."); // как избежать повтора
            // ответов?
        }
    }
}

