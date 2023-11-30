//Создайте массив с числами от 1 до 50. Программа должна случайно выбрать одно из этих чисел,
// а пользователь должен его угадать. После каждой попытки программа должна подсказывать: число
// больше или меньше загаданного. Подсказка:
//
//Для этой задачи вам понадобится метод, который генерирует рандомное число:
// Как использовать Random в Java
// Для генерации случайных чисел в Java часто используется класс Random.
// Сначала необходимо импортировать этот класс:
//
//Импорт класса: В начале вашего файла нужно импортировать класс Random.

import java.util.Random;
import java.util.Scanner;

public class L11Hw4 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        Random generator = new Random();
        int randomNumber = generator.nextInt(49 - 0) + 0;
        data(randomNumber);
    }

    public static void data(int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  число от 1 до 50");
        int number = scanner.nextInt();
        if (number == randomNumber) {
            System.out.println("Вы угадали число!");
        } else {
            if (number > randomNumber) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
            data(randomNumber);
        }
    }

}
