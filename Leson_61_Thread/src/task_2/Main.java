package task_2;

import task_01.MyThread1;

public class Main {
    public static int counter = 0;
    public static synchronized void increment(){
        counter++;
    }
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Result - " + counter);

    }
}
