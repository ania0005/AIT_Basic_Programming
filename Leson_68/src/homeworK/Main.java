package homeworK;
import java.util.concurrent.CountDownLatch;
public class Main {

    public static void main(String[] args) throws InterruptedException {

        // CountDownLatch.
        // Синхронизировать потоки так,
        // чтобы несмотря на их разную скорость,
        // все пассажиры вылетали одновременно на одном самолёте
        CountDownLatch latch = new CountDownLatch(5);
        new Passenger("Иван", latch);
        new Passenger("Пётр", latch);
        new Passenger("Сидор", latch);
        new Passenger("Поликарп", latch);
        new Passenger("Ефистафий", latch);



    }
}