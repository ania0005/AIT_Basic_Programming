//Описание: Вы программист, и вам поступил заказ на разработку сервиса для расчета стоимости
// проката автомобиля. Сервис должен учитывать различные факторы:
//
//Условия
//
//Тип автомобиля (Эконом - 'E' 100евро/день, Бизнес 'B' 200евро/день, Люкс 'L' 300евро/день)
//Длительность аренды (Если больше 3 дней, то скидка на всю аренду 4%, если больше 7, то 6%, если
// больше 30 то 10%)
//Возраст и опыт вождения клиента для машин класса Люкс. Проверяется следующим образом: для VIP
// возраст клиента должен быть больше или равен 20 опыт вождения не учитывается. Для обычных
// клиентов учитывается возраст он должен быть больше или равен 23 и опыт вождения - должен быть
// больше или равен 5 годам.
//Наличие страховки (ОСАГО - 'O' 20евро на все время аренды, КАСКО - 'K' 50евро на все время аренды)
//Дополнительные услуги (GPS - 10евро на все время аренды, детское кресло - 5евро на все время
// аренды)
//Наличие VIP-карты или купона на скидку (VIP - дает скидку на прокат - 12%, купон - 5%)
//Задания для выполнения:
//
//Разработайте методы для расчета стоимости аренды с учетом всех вышеуказанных факторов.
//Примените скидки для аренды более чем на 3, 7 и 30 дней.
//Добавьте логику для VIP-карт и купонов на скидку.
//Если скидка превышает 25%, выдайте клиенту купон на следующий прокат и примените скидку 25% (25% - это максимально возможная скидка).
//Проведите проверку возрастных и других ограничений для аренды автомобилей разных типов.
//Реализуйте дополнительную стоимость за превышение установленного лимита по расстоянию и пересечение границы

import java.util.Scanner;

public class Hw086 {
    public static void main(String[] arg) {
        rentCarTyp();

    }
    public static void rentCarTyp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для расчета стоимости аренды нашего авто, ответьте на следующие вопросы:");
        System.out.println("Какой тип авто Вы хотите арендовать? Эконом - Е, Бизнес - В, Люкс - L");
        String carType = scanner.nextLine();
        double rentCost;
        switch (carType) {
            case "Е":
                rentCost = 100;
                rentCarDay(rentCost);
                break;
            case "В":
                rentCost = 200;
                rentCarDay(rentCost);
                break;
            case "L":
                System.out.println("Укажите являетесь ли Вы Vip клиентом (Да / Нет)");
                String vip = scanner.nextLine();
                switch (vip) {
                    case "Да":
                        System.out.println("Укажите пожалуйста свой возраст");
                        byte age = scanner.nextByte();
                        if (age >= 20) {
                            rentCost = 300;
                            rentCarDay(rentCost);
                        } else
                            System.out.println("Ваш возраст не позволяет Вам арендовать авто Люкс класса, выбирете другой тип авто");
                        rentCarTyp();
                        break;
                    case "Нет":
                        System.out.println("Укажите пожалуйста свой возраст");
                        byte age1 = scanner.nextByte();
                        if (age1 >= 23) {
                            System.out.println("Укажите пожалуйста свой стаж вождения");
                            byte drivingЕxperience = scanner.nextByte();
                            if (drivingЕxperience >= 5) {
                                rentCost = 300;
                                rentCarDay(rentCost);
                            } else
                                System.out.println("Ваш стаж вождения не позволяет Вам арендовать авто Люкс класса, выбирете другой тип авто");
                            rentCarTyp();
                        } else
                            System.out.println("Ваш возраст не позволяет Вам арендовать авто Люкс класса, выбирете другой тип авто");
                        rentCarTyp();
                        break;
                    default:
                        System.out.println("Введите корректные данные");
                        rentCarTyp();
                }
            default:
                System.out.println("Введите корректные данные");
                rentCarTyp();
        }
    }
    public static double rentCarDay(double rentCost1) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите колличество дней на которое Вы хотите арендовать авто");
        byte dayRent = scanner1.nextByte();
        if (dayRent >= 1 & dayRent <= 3) {
            rentCost1 = dayRent * rentCost1;
            insurance(rentCost1);
        } else if (dayRent >= 4 & dayRent <= 7) {
            rentCost1 = dayRent * (rentCost1 - rentCost1 * 0.04);
            insurance(rentCost1);
        } else if (dayRent >= 8 & dayRent <= 30) {
            rentCost1 = dayRent * (rentCost1 - rentCost1 * 0.06);
            insurance(rentCost1);
        } else if (dayRent > 30 & dayRent <= 365) {
            rentCost1 = dayRent * (rentCost1 - rentCost1 * 0.1);
            insurance(rentCost1);
        } else if (dayRent <= 0) {
            System.out.println("Введите корректные данные");
            rentCarDay(rentCost1);
        }
        return rentCost1;
    }
    public static double insurance(double rentCost2) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите желаемый вид страховки (страховка обязательна):");
        System.out.println("ОСАГО - 'O' 20 евро");
        System.out.println("КАСКО - 'K' 50 евро");
        String insurance = scanner1.nextLine();
        switch (insurance) {
            case "О":
                rentCost2 = rentCost2 + 20;
                services(rentCost2);
                break;
            case "К":
                rentCost2 = rentCost2 + 50;
                services(rentCost2);
                break;
            default:
                System.out.println("Введите корректные данные");
                insurance(rentCost2);
        }
        return rentCost2;
    }
    public static double services(double rentCost3) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Дополнительные услуги: ");
        System.out.println("GPS - 10 евро: нажмите 'G' ");
        System.out.println("Детское кресло - 5 евро: нажмите 'D'");
        System.out.println("Если не интересует нажмите 'Дальше'");
        String selectingService = scanner1.nextLine();
        switch (selectingService) {
            case "G":
                rentCost3 = rentCost3 + 10;
                discount(rentCost3);
                break;
            case "D":
                rentCost3 = rentCost3 + 5;
                discount(rentCost3);
                break;
            case "Дальше":
                discount(rentCost3);
                break;
            default:
                System.out.println("Введите корректные данные");
                services(rentCost3);
        }
        return rentCost3;
    }
    public static double discount(double rentCost4) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Если у вас есть VIP карта нажмите 'V', в противном случае нажмите 'Далее' ");
        String discont = scanner1.nextLine();
        switch (discont) {
            case "V":
                rentCost4 = rentCost4 - rentCost4 * 0.12;
                System.out.println("Если у вас есть купон нажмите 'K', в противном случае нажмите 'Далее'");
                String discont1 = scanner1.nextLine();
                switch (discont1) {
                    case "К":
                        rentCost4 = rentCost4 - rentCost4 * 0.05;
                        result(rentCost4);
                        break;
                    case "Далее":
                        result(rentCost4);
                        break;
                    default:
                        System.out.println("Cделайте выбор");
                }
            case "Далее":
                System.out.println("Если у вас есть купон нажмите 'K', в противном случае нажмите 'Далее'");
                String kupon = scanner1.nextLine();
                switch (kupon) {
                    case "К":
                        rentCost4 = rentCost4 - rentCost4 * 0.05;
                        result(rentCost4);
                        break;
                    case "Далее":
                        result(rentCost4);
                        break;
                    default:
                        System.out.println("Cделайте выбор");
                }
                break;
            default:
                System.out.println("Cделайте выбор");
                discount(rentCost4);
        }
        return rentCost4;
    }
    public static void result(double rentCost5) {
        System.out.println("Cтоимость аренды авто составляет " + rentCost5 + " евро");
    }

}











