package task_2;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000000; i++) {
            Main.increment();

        }
    }
}
