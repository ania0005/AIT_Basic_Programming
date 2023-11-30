import java.util.Scanner;

//Определение времени суток (if-else-if-else) Напишите программу, которая принимает текущий час (от 0 до 23) и выводит
//приветствие в зависимости от времени суток ( утро, день, вечер, ночь).
public class Hw081 {
    public static void main(String[] args) {
        time();
    }
    public static void time() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущее время суток ");
        double curentTime = scanner.nextDouble();

        if (curentTime >= 0 & curentTime < 6) {
            System.out.println("Вы ввели " + curentTime + " Доброй ночи!");
        } else if (curentTime >= 6 & curentTime < 12) {
            System.out.println("Вы ввели " + curentTime + " Доброe утро!");
        } else if (curentTime >= 12 & curentTime < 18) {
            System.out.println("Вы ввели " + curentTime + " Добрый день!");
        } else if (curentTime >= 18 & curentTime <= 24) {
            System.out.println("Вы ввели " + curentTime + " Добрый вечер!");
        } else System.out.println("Некорректно введённое время");
    }
}
