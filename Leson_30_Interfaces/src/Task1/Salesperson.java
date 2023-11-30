package Task1;

public class Salesperson extends BaseEmployee{
    double baseSalary;
    int numberOfDeals;

    public Salesperson(String name, int id, int hireYear, double salary, double baseSalary, int numberOfDeals) {
        super(name, id, hireYear, salary);
        this.baseSalary = baseSalary;
        this.numberOfDeals = numberOfDeals;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * numberOfDeals;
    }

    @Override
    public String toString() {
        return "Salesperson{" +
                "baseSalary=" + baseSalary +
                ", numberOfDeals=" + numberOfDeals +
                '}';
    }
}
