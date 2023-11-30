//** Напишите программу, которая выводит на консоль таблицу умножения

public class L10Hw4 {
    public static void main(String[] args) {
        multiplication();
    }

    public static void multiplication() {
        byte n = 1;

        while (n <= 9) {
            System.out.println(n * 1 + "  " + n * 2 + "  " + n * 3 + "  " + n * 4 + "  " + n * 5 + "  " + n * 6 + "  " + n * 7 + "  " + n * 8 + "  " + n * 9);
            n++;
        }
    }
}

