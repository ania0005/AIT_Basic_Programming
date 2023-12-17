package task_02;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Random;

public class Building implements Runnable {
    private String city;
    private String[] stages;
    private boolean printTime;

    public Building(String city, String[] stages, boolean printTime) {
        this.city = city;
        this.stages = stages;
        this.printTime = printTime;

    }

    @Override
    public void run() {
        for (String stage : stages){
            if(printTime) {
                //Berlin: 1.Progect, Thread_name -> time
                System.out.printf("%s: %s, %s -> %s%n",
                        city, stage, Thread.currentThread().getName(), new Date());
            } else{
                System.out.printf("%s: %s, %s%n",
                        city, stage, Thread.currentThread().getName());
            }
            Random random = new Random();
            int delay = random.nextInt(1000, 5000);
            try{
                Thread.sleep(delay);
            } catch (InterruptedException e){
                throw  new RuntimeException();
            }

        }
    }
}
