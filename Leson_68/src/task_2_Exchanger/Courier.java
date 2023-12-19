package task_2_Exchanger;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Courier extends Thread {
    private String start;
    private String destination;
    private List<Package> packages;
    private Courier anotherCourier;
//  private boolean inExchangePoint;
    private Exchanger<Package> exchanger;

    public Courier(String start, String destination, List<Package> packages, Exchanger<Package> exchanger ) {
        this.exchanger = exchanger;
        this.start = start;
        this.destination = destination;
        this.packages = packages;
        start();
    }

    public void setAnotherCourier(Courier anotherCourier) {
        this.anotherCourier = anotherCourier;
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            int timeDelay = random.nextInt(9000) + 1000;

            Thread.sleep(timeDelay);
            System.out.printf("%s выехал из точки %s.%n", this, start);

            Thread.sleep(timeDelay);
            System.out.printf("%s доехал до пункта обмена .%n", this);

//            inExchangePoint = true;
//
//            if(anotherCourier.inExchangePoint){
//                Package receivedPackage = anotherCourier.getIrrelevantPackage();
//                packages.add(receivedPackage);
//            }

            Package pack = exchanger.exchange(getIrrelevantPackage());
            packages.add(pack);

            Thread.sleep(timeDelay);

//            if(anotherCourier.inExchangePoint){
//                Package receivedPackage = anotherCourier.getIrrelevantPackage();
//                packages.add(receivedPackage);
//            }
//            inExchangePoint = false;

            System.out.printf("%s уехал из пункта обмена .%n", this);

            Thread.sleep(timeDelay);
            System.out.printf("%s доехал до точки выгрузки %s.%n", this, destination);

            Thread.sleep(timeDelay);
            unload();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Package getIrrelevantPackage(){
        Iterator<Package> iterator = packages.iterator();
        while (iterator.hasNext()){
            Package pack = iterator.next();
            if(!destination.equals(pack.getTo())){
                iterator.remove();
                System.out.printf("%s отдал другому курьеру %s.%n",this, pack );
                return pack;
            }
        }
        return null;
    }

    private void unload() {
        Iterator<Package> iterator = packages.iterator();
        while (iterator.hasNext()) {
            Package pack = iterator.next();
            if (destination.equals(pack.getTo())) {
                System.out.printf("%s успешно доставил %s.%n", this, pack);
                iterator.remove();
            }
        }

        if (packages.isEmpty()) {
            System.out.printf("%s успешно доставил все посылки.%n", this);
        } else {
            System.out.printf("%s не доставил все посылки.%n", this);
        }
    }

    @Override
    public String toString() {
        return String.format("Курьер {%s -> %s}", start, destination);
    }
}

