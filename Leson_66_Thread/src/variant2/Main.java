package variant2;
// Решить задачу со слайда №5 презентации в 1 поток и в 2 потока.
// Результат должен быть одинаковым.

// Решение задачи в 2 потока
public class Main {
    public static int num = 4;
    public static int count1 = 0;
    public static int count2 = 0;

    public static void main(String[] args) {

        MyThread01 myThread01 = new MyThread01();
        MyThread02 myThread02 = new MyThread02();

        myThread01.start();
        myThread02.start();
        try {
            myThread01.join();
            myThread02.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        count1 += count2;

        System.out.println("Total divisible by " + num + " - " + count1);
    }
}
