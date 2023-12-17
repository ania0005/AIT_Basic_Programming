package Homework.Task2;

public class Variant1 extends Thread {
    //*** Есть три потока.
    // 1 поток выводит в консоль пять раз букву А (без переноса строки)
    // 2 поток выводит в консоль пять раз букву В (без переноса строки)
    // 3 поток выводит в консоль пять раз букву С (без переноса строки)
    // Запустить потоки одновременно, но добиться такого результата,
    // чтобы получить вывод в консоль -> ABCABCABCABCABC
    // Результат должен выводиться моментально, то есть sleep использовать нельзя.
    // Без пулов потоков (при помощи стандартных способов с первого урока по многопоточности).

    private static String data = "";

    public static void run(String litera) {
        for (int i = 0; i < 5; i++) {
            synchronized (data) {
                try {
                    data.notifyAll();
                    data.wait(1);
                    System.out.print(litera);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            run("A");
        };
        Runnable runnable2 = () -> {
            run("B");
        };
        Runnable runnable3 = () -> {
            run("C");
        };

        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread thread2 = new Thread(runnable2);
        thread2.start();
        Thread thread3 = new Thread(runnable3);
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}


