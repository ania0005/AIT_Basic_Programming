package Homework.Task2;

public class Variant2 extends Thread {
    //*** Есть три потока.
    // 1 поток выводит в консоль пять раз букву А (без переноса строки)
    // 2 поток выводит в консоль пять раз букву В (без переноса строки)
    // 3 поток выводит в консоль пять раз букву С (без переноса строки)
    // Запустить потоки одновременно, но добиться такого результата,
    // чтобы получить вывод в консоль -> ABCABCABCABCABC
    // Результат должен выводиться моментально, то есть sleep использовать нельзя.
    // Без пулов потоков (при помощи стандартных способов с первого урока по многопоточности).

    private static String data = "";

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            for (int i = 0; i < 5; i++) {
                synchronized (data) {
                    try {
                        data.notifyAll();
                        data.wait(5);
                        System.out.print("A");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 5; i++) {
                synchronized (data) {
                    try {
                        data.notifyAll();
                        data.wait(5);
                        System.out.print("B");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable runnable3 = () -> {
            for (int i = 0; i < 5; i++) {
                synchronized (data) {
                    try {
                        data.notifyAll();
                        data.wait(5);
                        System.out.print("C");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
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


