import java.util.Scanner;

//Определение тарифа для мобильной связи (if-else-if-else) Оператор мобильной связи предлагает
// три тарифа: "Эконом", "Стандарт" и "Премиум". Если клиент использует менее 500 минут в месяц, ему подходит "Эконом".
// Если от 500 до 1000 минут — "Стандарт".
// Если больше 1000 минут — "Премиум". Программа должна принимать количество минут и выводить подходящий тариф.
public class Hw08 {
    public static void main(String[] args) {
        tarif();
    }

    public static void tarif() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимое Вам колличество минут в месяц ");
        int minMonth = scanner.nextInt();

        if (minMonth <= 499) {
            System.out.println("Вам подходит Эконом пакет");
        } else if (minMonth >= 500 & minMonth <= 999) {
            System.out.println("Вам подходит пакет Стандарт");
        } else if (minMonth >= 1000) {
            System.out.println("Вам подходит пакет Премиум");

        }
    }
}
