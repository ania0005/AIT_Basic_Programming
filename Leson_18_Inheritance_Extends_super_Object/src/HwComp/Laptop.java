package HwComp;

public class Laptop extends Device {
    private String batteryType;
    private String screenSize;

    public Laptop(String type, String brand, int memory, String batteryType, String screenSize) {
        super(type, brand, memory);
        this.batteryType = batteryType;
        this.screenSize = screenSize;
    }
    public void printDetailsLaptop() {
        super.printDetails();
        System.out.println("Battery type  " + this.batteryType + "  Display size  " + this.screenSize);
        System.out.println();
    }
}
