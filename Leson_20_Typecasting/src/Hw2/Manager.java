package Hw2;

public class Manager extends Employee {
    private int numSubordinates;

    public Manager(String name,int salary, int numSubordinates) {
        super(name, salary);
        this.numSubordinates = numSubordinates;
    }
    public void work() {
        System.out.print(" Name: " + this.getName() + "\t" + "Salary: " + this.getSalary() + "\t" + "Subordinates: " + this.getNumSubordinates() + "  ");
        System.out.println("\"Я менеджер, я управляю командой\"");
    }

    public int getNumSubordinates() {
        return numSubordinates;
    }

    public void setNumSubordinates(int numSubordinates) {
        this.numSubordinates = numSubordinates;
    }
}
