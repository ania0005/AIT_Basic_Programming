package task_1_Semaphor;

import java.util.concurrent.Semaphore;

public class Car extends Thread {
    private final Semaphore semaphore;

    public Car(String name, Semaphore semaphore){
       this.semaphore = semaphore;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            long start = System.currentTimeMillis();
            System.out.printf("Автомобиль %s на старте.%n", getName());
            Thread.sleep(3000);
            System.out.printf("Автомобиль %s начал движение.%n", getName());
            Thread.sleep(3000);
            System.out.printf("Автомобиль %s подъехад к тонелю.%n", getName());
            Thread.sleep(3000);
            semaphore.acquire();
            System.out.printf("Автомобиль %s въехал в тонель.%n", getName());
            Thread.sleep(3000);
            System.out.printf("Автомобиль %s выехал из тонеля.%n", getName());
            semaphore.release();
            Thread.sleep(3000);
            System.out.printf("Автомобиль %s финишировал за %d c.%n", getName(), (System.currentTimeMillis() - start) / 1000);


        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}



















