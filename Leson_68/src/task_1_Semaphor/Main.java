package task_1_Semaphor;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);

        new Car("Honda", semaphore);
        new Car("Audi", semaphore);
        new Car("BMW", semaphore);
        new Car("Mersedes", semaphore);

    }
}
