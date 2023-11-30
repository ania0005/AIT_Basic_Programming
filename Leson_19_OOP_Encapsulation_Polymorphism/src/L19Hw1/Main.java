package L19Hw1;
//Конкурс по съеданию пиццы
//У нас проводится конкурс по съеданию пиццы с участием группы из 5 до 8 человек. Каждый участник принимает участие
// в конкурсе и съедает случайное количество кусков пиццы, которое может быть от 0 до 6. Нам нужно провести анализ
// результатов конкурса и определить следующее:
//Количество съеденных кусков: Необходимо определить, сколько кусков пиццы съел каждый участник.
//Победитель: Определить, кто из участников съел наибольшее количество кусков пиццы и стал победителем конкурса.
//Второе и третье место: Определить участников, занявших второе и третье место в конкурсе
//Использованные пиццы: Рассчитать общее количество пицц, которые были использованы для конкурса, учитывая, что
// каждая пицца была разрезана на 8 кусков.
//Не съеденные куски: Определить, сколько кусков пиццы осталось несъеденными после завершения конкурса.
//Награды: Вручить награды победителям с первого по третье место в соответствии с призами: первому месту -
// золотую медаль и сертификат на бесплатную пиццу, второму месту - серебряную медаль и сертификат на скидку 50% на
// следующую пиццу, третьему месту - бронзовую медаль и сертификат на скидку 25% на следующую пиццу.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Person[] peoples = new Person[8];
        peoples[0] = new Person(1, "Ivanov");
        peoples[1] = new Person(2, "Smirnov");
        peoples[2] = new Person(3, "Petrov");
        peoples[3] = new Person(4, "Zuev");
        peoples[4] = new Person(5, "Nazarov");
        peoples[5] = new Person(6, "Li");
        peoples[6] = new Person(7, "Girr");
        peoples[7] = new Person(8, "Chan");

        Random random = new Random();
        int arraySize = random.nextInt(9 - 5) + 5;  // рандомный отбор участников
        Person[] participants = new Person[arraySize];
        for (int i = 0; i < participants.length; i++) {
            participants[i] = peoples[i];
            participants[i].displayParticipants();  //вывод на печать списка участников
        }
        System.out.println();
        generateSlaisPizza(participants);
        System.out.println();
        prizesPresentation(participants);
    }
    public static void generateSlaisPizza(Person[] participants) {

        Random random = new Random();
        int allSlaices = 0;
        int allPizzas = 0;
        int[] arraySlaices = new int[participants.length];
        for (int i = 0; i < participants.length; i++) {
            Person currentPerson = participants[i];
            int slaices = random.nextInt(7);   //рандомное определение съеденых пицц.
            currentPerson.setPizzaslais(slaices);
            arraySlaices[i] = slaices;
            allSlaices += slaices;                    //расчет съденых кусков пиццы
            allPizzas = allSlaices / 8 + 1;           //расчет съденых  пицц.

        }
        System.out.println(Arrays.toString(arraySlaices));    //вывод на печать массива съеденных участниками кусков пицц
        System.out.println(allSlaices + " slices of pizza were eaten");
        System.out.println(allPizzas + " pizzas were spent on the competition");

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arraySlaices.length - 1; i++) {     //пузырьковая сортировка (нашла в интернете через
                if (arraySlaices[i] < arraySlaices[i + 1]) {       // boolean переменную)))
                    isSorted = false;
                    temp = arraySlaices[i];
                    arraySlaices[i] = arraySlaices[i + 1];
                    arraySlaices[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arraySlaices));        // вывод на печать отсортированного массива съденых пицц
        arraySlaices = Arrays.stream(arraySlaices).distinct().toArray(); //убрала дублекаты в отсортированном массиве
        System.out.println(Arrays.toString(arraySlaices));//вывод на печать полученного массива
        System.out.println();

        for (int j = 0; j < arraySlaices.length; j++) {
            for (int i = 0; i < participants.length; i++) {
                Person currentPerson = participants[i];
                if (currentPerson.getPizzaslais() == arraySlaices[j] && currentPerson.getPizzaslais() != 0) {
                    System.out.println((j + 1) + " place");            //определение призовых мест
                    currentPerson.setWinningPlace(j + 1);
                    participants[i].display();

                }
            }
        }
    }
    public static void prizesPresentation(Person[] participants) {
        for (int i = 0; i < participants.length; i++) {
            Person currentPerson = participants[i];
            if (currentPerson.getWinningPlace() == 1) {
                System.out.println(currentPerson.getName() + "  first place - awarded a gold medal and a certificate for free pizza.");
            } else if (currentPerson.getWinningPlace() == 2) {
                System.out.println(currentPerson.getName() + "  second place - awarded a silver medal and certificate for a 50% discount");
            } else if (currentPerson.getWinningPlace() == 3) {
                System.out.println(currentPerson.getName() + "  third place - awarded a bronze medal and certificate for a 25% discount on your next pizza");
            }
        }
    }
}









