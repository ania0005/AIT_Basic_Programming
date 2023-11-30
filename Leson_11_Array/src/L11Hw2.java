import java.util.Scanner;

//Создайте массив с числами от 1 до 10. Пусть пользователь вводит 3 числа. Проверьте, сколько чисел пользователь угадал.
public class L11Hw2 {
    public static void main(String[] args) {
        int[] data = new int[10];
        data[0] = 1;
        data[1] = 2;
        data[2] = 2;
        data[3] = 4;
        data[4] = 5;
        data[5] = 2;
        data[6] = 7;
        data[7] = 2;
        data[8] = 9;
        data[9] = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = scanner.nextInt();
        int n = data.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (data[i] == number1) {
                System.out.println("Вы угадали число " + number1);
                counter++;
            }
            if (data[i] == number2) {
                System.out.println("Вы угадали число " + number2);
                counter++;
            }
            if (data[i] == number3) {
                System.out.println("Вы угадали число " + number3);
                counter++;
            }
        }
    }
}
