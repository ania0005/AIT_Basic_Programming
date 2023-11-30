import java.time.LocalTime;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class TimerMain  {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input secunds");
        int counter = scanner.nextInt();
        System.out.println("Start timer :");
        timer(counter);

        System.out.println("Push enter to start");
        scanner.next();

        System.out.println("Push enter to start");
        scanner.next();
        System.out.println("Start timer :");
        timer(counter);


        System.out.println("Start timer");
        System.out.println("Push enter to finish");
        scanner.nextLine();
        System.out.println("Duration between start to end " + 10000);
        //printEachSec();
    }



    public static void sleep(long sleepDurationInMs) {
        try {
            // ctrl + q
            // ctrl + b
            Thread.sleep(sleepDurationInMs);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }



    public static void timer(int counter) {
        while (counter >= 0) {
            sleep(1000);
            System.out.println(counter--);
        }
        System.out.println("Time is out");
    }


    public int stopWatch() {

        return 0;
    }


    public String atcher(LocalTime time, String str) {
        return null;
    }
}