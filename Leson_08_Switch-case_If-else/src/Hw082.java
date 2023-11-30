import java.util.Scanner;

//У продавца есть товар, который он хочет продать. Он может продать товар за 100 евро,
// если покупатель согласен на эту цену. Если покупатель не согласен на эту цену,
// продавец может предложить скидку в 10%. Если покупатель не согласен и на эту цену,
// продавец может предложить скидку в 20%.
// Если покупатель не согласен и на эту цену, продавец отказывается продавать товар.
public class Hw082 {
    public static void main(String[] args) {
        sale(100);
    }

    public static void sale(double pris) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Товар стоит 100 евро, Вы согласны на эту цену?");
        String agreement = scanner.nextLine();
        switch (agreement) {
            case "Да":
                System.out.println("Отлично! Внесите в кассу " + pris + " евро.");
                break;
            case "Нет":
                System.out.println("Возможно Вы купите товар за " + (pris - pris * 0.1) + " евро?");
                agreement = scanner.nextLine();
                switch (agreement) {
                    case "Да":
                        System.out.println("Отлично! Внесите в кассу " + (pris - pris * 0.1) + " евро.");
                        break;
                    case "Нет":
                        System.out.println("Возможно Вы купите товар за " + (pris - pris * 0.2) + " евро?");
                        agreement = scanner.nextLine();
                        switch (agreement) {
                            case "Да":
                                System.out.println("Отлично! Внесите в кассу " + (pris - pris * 0.2) + " евро.");
                                break;
                            case "Нет":
                                System.out.println("Извините, но это была окончательная цена.");

                        }

                }
            default:
                System.out.println("Введите Да или Нет, пожалуйста.");
        }

    }
}
