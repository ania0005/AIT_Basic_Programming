import java.util.Scanner;

//За каждый месяц банк начисляет к сумме вклада 12% от суммы. Напишите программу, в которую пользователь вводит
// сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов
// за каждый месяц.
public class L10Hw2 {
    public static void main(String[] args) {
        deposit(12);
    }

    public static void deposit(double percent) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        double depositAmount = scanner.nextInt();
        System.out.println("Введите колличество месяцев");
        int numberMonth = scanner.nextInt();
        for (int n = 1; n <= numberMonth; n++) {
            depositAmount = depositAmount + depositAmount * percent / 100;
            System.out.println("После " + n + " месяца, сумма Вашего депозита составит " + depositAmount);
        }
    }
}
