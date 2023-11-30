package HwComp;

public class Comp extends Device {
    private String systemUnitType;
    private String monitorType;

    public Comp(String type, String brand, int memory, String systemUnitType, String monitorType) {
        super(type, brand, memory);
        this.systemUnitType = systemUnitType;
        this.monitorType = monitorType;
    }
    public void printDetailsComp() {
        super.printDetails();
        System.out.println("System unit type  " + this.systemUnitType + "  Monitor type  " + this.monitorType);
    }
}
