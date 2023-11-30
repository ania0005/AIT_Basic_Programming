import java.util.Arrays;
import java.util.Scanner;

//Создайте массив из 5 элементов для хранения оценок студента. Заполните массив оценками
// и вычислите средний балл студента.
//используйте Scanner для заполнения массива.

public class L12 {

    public static void main(String[] args) {
        int[] notes = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценки");

        for (int i = 0; i < notes.length; i++) {
            notes[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(notes));
        scanner.close();

        int summe = 0;
        for (int i = 0; i < notes.length; i++) {
            summe += notes[i];

        }
        double result = (double) summe / notes.length;
        System.out.println("Средний бал " + result);

    }

}

