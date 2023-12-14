package variant2;

public class MyThread02 extends Thread {
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % Main.num == 0) {
                Main.count2++;
            }
        }
    }
}

