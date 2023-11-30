package Hw2;

public class Intern extends Employee{
    private String university;

    public Intern(String name, int salary, String university) {
        super(name, salary);
        this.university = university;
    }
    public void work(){
        System.out.print(" Name: " + this.getName() + "\t" + "Salary: " + this.getSalary() + "\t" + "University: " + this.getUniversity()+ "  ");
        System.out.println("\"Я учусь и работаю\"");
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
