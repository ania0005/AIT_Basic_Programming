package Task1;

public class Manager extends BaseEmployee{
    // baseSalary и numberOfProjects, и реализует метод calculateSalary().
    double baseSalary;
    int numberOfProjects;

    public Manager(String name, int id, int hireYear, double salary, double baseSalary, int numberOfProjects) {
        super(name, id, hireYear, salary);
        this.baseSalary = baseSalary;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "baseSalary=" + baseSalary +
                ", numberOfProjects=" + numberOfProjects +
                '}';
    }

    @Override
    public double calculateSalary() {
        return baseSalary * numberOfProjects;

    }
}
