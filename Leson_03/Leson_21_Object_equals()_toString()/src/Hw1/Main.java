package Hw1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Trailer", "VW", 2022, "VSWXA3421L" );
        Car car2= new Car("Pcap", "Honda", 2008, "KJWXA4321T");
        Car car3 = new Car("Trailer", "Mercedes", 2013, "COPRA9371R");
        Car car4 = new Car("Trailer", "VW", 2022, "VSWXA3421L" );

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car4));
    }
}
