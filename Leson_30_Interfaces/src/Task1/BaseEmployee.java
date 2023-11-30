package Task1;

public abstract class BaseEmployee implements Employee {
    //BaseEmployee (Абстрактный класс):
    //
    //Реализует интерфейс Employee и предоставляет общую функциональность для всех работников.
    //Содержит общие поля и методы, такие как name, id, hireYear, salary, adjustSalaryByExperience().
    //Метод calculateSalary() оставлен для реализации в подклассах.
   private    String name;
   private Integer id;
   private int hireYear;
   private double salary;

    public BaseEmployee(String name, int id, int hireYear, double salary) {
        this.name = name;
        this.id = id;
        this.hireYear = hireYear;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hireYear=" + hireYear +
                ", salary=" + salary +
                '}';
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
    public int getHireYear() {
        return hireYear;
    }
    @Override
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateSalary();
    public void adjustSalaryByExperience(){

   }
}
