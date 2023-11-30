package HwComp;
//Создайте иерархию классов для компьютерных устройств: ноутбуки и стационарные компьютеры. Каждое устройство
// имеет атрибуты марка и объем памяти.
//
//Создайте методы для вывода информации о каждом устройстве, включая его тип (ноутбук или стационарный компьютер),
// марку и объем памяти.
//
//Создайте объекты разных типов компьютерных устройств и выведите информацию о каждом из них.

public class Device {
    private String type;
    private String brand;
    private int memory;

    public Device(String type, String brand, int memory) {
        this.type = type;
        this.brand = brand;
        this.memory = memory;
    }
    public void printDetails() {
        System.out.println("Description of devices");
        System.out.println("```````````````````````");
        System.out.println("Type  " + this.type + "  Brand  " + this.brand+" Memory  "+this.memory);
            }
}
