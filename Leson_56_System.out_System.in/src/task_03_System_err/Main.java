package task_03_System_err;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст");
        int age = scanner.nextInt();

        if(age < 0 ){
            System.err.println("Возраст не может быть отрицательным"); // c err сообщение об ошибке
            return;                                                       // выведиться красным цветом
        }
        System.out.println("Ваш возраст - " + age);
    }
}
