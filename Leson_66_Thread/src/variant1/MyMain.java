package variant1;
// Решить задачу со слайда №5 презентации в 1 поток и в 2 потока.
// Результат должен быть одинаковым.

// Решение задачи в 1 поток.
public class MyMain {
    public static int num = 4;
    public static int count = 0;

    public static void main(String[] args) {

        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i % num == 0) {
                count++;
            }
        }
        System.out.println("Total divisible by " + num + " - " + count);
    }
}
