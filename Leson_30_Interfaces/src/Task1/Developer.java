package Task1;

public class Developer extends BaseEmployee{
    // hourlyRate и hoursWorked, и реализует метод calculateSalary().
    public int hourlyRate;
    public int hoursWorked;

    public Developer(String name, int id, int hireYear, double salary, int hourlyRate, int hoursWorked) {
        super(name, id, hireYear, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
            }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public double calculateSalary() {
        return  hourlyRate * hoursWorked;

    }
}
