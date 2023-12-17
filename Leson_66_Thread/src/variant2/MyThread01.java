package variant2;

public class MyThread01 extends Thread {

    public void run() {
        for (int i = Integer.MIN_VALUE; i < 0; i++) {
            if (i % Main.num == 0) {
                Main.count1++;
            }
        }
    }
}
