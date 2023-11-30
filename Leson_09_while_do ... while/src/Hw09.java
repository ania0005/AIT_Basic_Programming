
//Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while.
// Распечатать все числа от 1 до 100 которые делятся на 5 без остатка.
// Используем цикл do-while
public class Hw09 {

    public static void main(String[] args) {
        int task = 1;
        while (task > 0 & task <= 10) {
            System.out.println("Task" + task);
            task++;
        }
        moduls();
    }

    public static void moduls() {
        int x = 1;
        System.out.println();
        do {
            if (x % 5 == 0) {
                System.out.println("Число " + x + " делиться на 5");
            }
            x++;
        } while (x <= 100);

    }

}
