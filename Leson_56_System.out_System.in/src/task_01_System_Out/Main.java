package task_01_System_Out;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.print("One! ");
        System.out.print("Two! ");
        System.out.print("Three! ");

        System.out.println();

        System.out.println("One! ");
        System.out.println("Two! ");
        System.out.println("Three! ");

        System.out.println();
        System.out.println("One!\nTwo!\nThree!");

        System.out.println();
        System.out.printf("One!\nTwo!\nThree!\n");

        System.out.println();
        System.out.println("One!%nTwo!%nThree!%n");

        System.out.println();

        int a = 4;
        int b = 7;
        System.out.printf("Sum 3 and 5 = 8");
        System.out.println();
        System.out.printf("Sum %d and %d = %d.%n", a, b, a+b);
        String hello = "Hello yours!";

        System.out.printf("Подставляем строку - %s - строка подставлена.%n", hello);
        System.out.println();

        System.out.printf("Подставляем строку - %.8s - строка подставлена.%n", hello); // %.8s обрезает вставляемую строку,
        // выводит только первые 8 симолов
        System.out.println();

        double pi = Math.PI;
        System.out.printf("PI = %f.%n", pi);   // %f подставляет не целочисленое значение
        System.out.printf("PI = %.3f.%n", pi); // %.3f можем выбрать сколько знаков после запятой

        System.out.println();
        boolean bool = true;
        System.out.printf("Boolean = %b.%n", bool);
        System.out.printf("a > b ? %b.%n", a > b);
        System.out.printf("a < b ? %B.%n", a < b);

        System.out.println();
        char ch = 'w';
        System.out.printf("Подставляем символ - %c - символ подставлен.%n", ch);
        System.out.printf("Подставляем символ - %C - символ подставлен.%n", ch);

        System.out.println();
        double d1 = 123.43;
        double d2 = 123456.7765444;
        System.out.printf("%50.3f%n", d1);
        System.out.printf("%50.7f%n", d2);
        System.out.printf("%50.5f%n", d2);

        System.out.println();

        Date date = new Date();
        System.out.println(date);
        System.out.printf("Format Data - %tT.%n", date);
        System.out.printf("Format Data - %tH.%n", date);
        System.out.printf("Format Data - %tB.%n", date);
        System.out.printf("Format Data - %tY.%n", date);
        System.out.printf("Format Data - %tM.%n", date);
        System.out.printf("Format Data - %tC.%n", date);

        System.out.printf("Часы - %tH, минуты - %tM, секунды - %tS.%n", date, date, date);
        System.out.printf("Tuday %td %tB %tY ,cloock - %tH : %tM. %n", date, date,date, date, date);
        System.out.printf("Tuday %1$td %1$tB %1$tY ,cloock - %1$tH : %1$tM. %n", date);
    }
}
