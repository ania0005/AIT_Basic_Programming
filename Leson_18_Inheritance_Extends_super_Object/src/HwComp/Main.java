package HwComp;

public class Main {
    public static void main(String[] args) {

        Device comp01 = new Comp("Comp", "Assus", 128, "LF654", "712Ys32");
        Device comp02 = new Comp("Comp", "Acer", 256, "LF114", "442Ds32");
        Device comp03 = new Comp("Comp", "Apple", 256, "NF114", "042Ds72");

        Device laptop01 = new Laptop("Laptop", "HP", 64, "we-65", "19'");
        Device laptop02 = new Laptop("Laptop", "Apple", 128, "we-65", "21'");
        Device laptop03 = new Laptop("Laptop", "Assus", 64, "tr-25", "16'");



        Laptop laptop1 = (Laptop) laptop01;
        laptop1.printDetailsLaptop();
        Laptop laptop2 = (Laptop) laptop02;
        laptop2.printDetailsLaptop();
        Laptop laptop3 = (Laptop) laptop03;
        laptop3.printDetailsLaptop();

        Comp Comp1 = (Comp) comp01;
        Comp1.printDetailsComp();
        Comp Comp2 = (Comp) comp02;
        Comp2.printDetailsComp();
        Comp Comp3 = (Comp) comp03;
        Comp3.printDetailsComp();





    }
}
