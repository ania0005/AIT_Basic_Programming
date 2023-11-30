package Hw2;

public class Engineer extends Employee{
    private String specialization;

    public Engineer(String name, int salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }
    public void work(){
        System.out.print(" Name: " + this.getName() + "\t"+ "Salary: " + this.getSalary() + "\t" + "Specialization: " + this.getSpecialization()+ "  ");
        System.out.println("\"Я разрабатываю\"");
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
